package org.pena.canuto.luis.enrique.inicio;
import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.TipoEjecutable;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;

public class Inicio {

    /**
     * Default constructor
     */
    public Inicio() {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        org.gerdoc.model.figura.TipoEjecutable tipoEjecutable = null;
        Historiales historiales = null;
        Ejecutable ejecutable = null;
        historiales = Historial.getInstance( );
        while( flag )
        {
            org.gerdoc.vista.Menu.principal2( );
            org.gerdoc.vista.Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            tipoEjecutable = org.gerdoc.model.figura.TipoEjecutable.getTipoEjecutableById( opcion );
            if( org.gerdoc.model.figura.TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                flag = false;
            }
            if( org.gerdoc.model.figura.TipoEjecutable.HISTORIAL.equals( tipoEjecutable ) )
            {
                historiales.imprimir( );
            }
            if( TipoEjecutable.OPCION_INVALIDA.equals( tipoEjecutable ) )
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