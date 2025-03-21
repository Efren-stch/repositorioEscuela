package org.gerdoc.model.figura;

import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Ventana;

public enum TipoEjecutable {
    CONSOLA_PRINCIPAL(1, Consola.getInstance()),
    CONSOLA_SOTO_CHAVEZ_EFREN(2, org.soto.chavez.efren.vista.consola.Consola.getInstance()),
    CONSOLA_PENA_CANUTO_LUIS_ENRIQUE(3, org.pena.canuto.luis.enrique.vista.Consola.getInstance()),
    VENTANA_PRINCIPAL(4, Ventana.getInstance()),
    VENTANA_SOTO_CHAVEZ_EFREN(5, org.soto.chavez.efren.vista.ventana.Ventana.getInstance()),
    VENTANA_PENA_CANUTO_LUIS_ENRIQUE(6, org.pena.canuto.luis.enrique.vista.Ventana.getInstance()),
    HISTORIAL(7, null),
    SALIR(8, null),
    OPCION_INVALIDA(8, null);
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA_PRINCIPAL;
            case 2:
                return CONSOLA_SOTO_CHAVEZ_EFREN;
            case 3:
                return CONSOLA_PENA_CANUTO_LUIS_ENRIQUE;
            case 4:
                return VENTANA_PRINCIPAL;
            case 5:
                return VENTANA_SOTO_CHAVEZ_EFREN;
            case 6:
                return VENTANA_PENA_CANUTO_LUIS_ENRIQUE;
            case 7:
                return HISTORIAL;
            case 8:
                return SALIR;
            default:
                return OPCION_INVALIDA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}