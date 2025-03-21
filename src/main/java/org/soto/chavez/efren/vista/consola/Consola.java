package org.soto.chavez.efren.vista.consola;

import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.model.figura.util.FiguraEnum;
import org.soto.chavez.efren.model.figura.util.FiguraFactory;

public class Consola implements Ejecutable {
    private Historiales historiales;
    private static Consola consola;
    private Consola() {
    }
    public static Consola getInstance( ) {
        if(consola == null) {
            consola = new Consola();
        }
        return consola;
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
    @Override
    public void run() {
        int opcion;
        FiguraEnum figuraEnum = null;
        Figura figura = null;

        while (true) {
            System.out.println(Salidas.principalFiguras);
            opcion = ReadUtil.readInt(Salidas.seleccionarOpcion, 1, 7);

            figuraEnum = FiguraEnum.getFiguraEnumByTipo(opcion);

            if (FiguraEnum.SALIR.equals(figuraEnum)) {
                return;
            } else if (FiguraEnum.OPCION_ERRONEA.equals(figuraEnum)){
                Salidas.opcionInvalida();
            }

            figura = FiguraFactory.getFiguraByFiguraEnum(figuraEnum);
            if( figura != null ) {
                (( SolicitaDatos ) figura).leeDatos();
                System.out.println(Salidas.imprimirResultado( figura ));
                if( historiales != null )
                {
                    historiales.addFigura( figura );
                }
            }

        }
    }

}