package org.soto.chavez.efren.inicio;

import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.TipoEjecutable;

public class Inicio {
    public static void main(String args[]) {
        int opcion;
        TipoEjecutable tipoEjecutable = null;
        Historiales historiales = null;
        Ejecutable ejecutable = null;
        historiales = Historial.getInstance( );
        System.out.println("Hola Efrén");

        while ( true ) {
            System.out.println(Salidas.principal);
            opcion = ReadUtil.readInt(Salidas.seleccionarOpcion, 1, 3);

            tipoEjecutable = TipoEjecutable.getTipoEjecutableById( opcion );

            if( org.gerdoc.model.figura.TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                return;
            }
            if( org.gerdoc.model.figura.TipoEjecutable.HISTORIAL.equals( tipoEjecutable ) )
            {
                historiales.imprimir( );
            }
            if( org.gerdoc.model.figura.TipoEjecutable.OPCION_INVALIDA.equals( tipoEjecutable ) )
            {
                Menu.opcionInvalida( );
            }
            if( tipoEjecutable.getEjecutable( ) != null )
            {
                ejecutable = tipoEjecutable.getEjecutable( );
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }

        }
    }
}