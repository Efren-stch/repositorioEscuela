package org.soto.chavez.efren.vista;

import org.gerdoc.vista.Ejecutable;
import org.soto.chavez.efren.vista.consola.Consola;
import org.soto.chavez.efren.vista.ventana.Ventana;

public enum TipoEjecutable {
    CONSOLA( 1, Consola.getInstance() ),
    VENTANA( 2, Ventana.getInstance() ),
    SALIR( 3, null ),
    OPCION_ERRONEA( 4, null );

    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }

    public void setEjecutable(Ejecutable ejecutable) {
        this.ejecutable = ejecutable;
    }

    public static TipoEjecutable getTipoEjecutableById ( Integer opcion ) {
        return switch ( opcion ) {
            case 1 -> CONSOLA;
            case 2 -> VENTANA;
            case 3 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }
}
