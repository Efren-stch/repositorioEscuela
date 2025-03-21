package org.pena.canuto.luis.enrique.model.figura;

import org.gerdoc.vista.Ejecutable;
import org.pena.canuto.luis.enrique.vista.Consola;
import org.pena.canuto.luis.enrique.vista.Ventana;

public enum TipoEjecutable
{
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null );
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable)
    {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId()
    {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById( int opcion )
    {
        switch( opcion )
        {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
    public Ejecutable getEjecutable()
    {
        return ejecutable;
    }
}
