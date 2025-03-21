package org.soto.chavez.efren.model.figura.util;

public enum FiguraEnum {
    //Figuras Principales
    CUADRADO(1), RECTANGULO(2), ROMBO(3), TRAPECIO(4),
    POLIGONO_REGULAR(5),
    TRIANGULO(6),
    SALIR(7), OPCION_ERRONEA(8),
    //Figuras Triángulos
    EQUILATERO(1),ISOSCELES(2), ESCALENO(3);
    private Integer tipo;

    FiguraEnum(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public static FiguraEnum getFiguraEnumByTipo ( Integer tipo ){
        return switch ( tipo ) {
            case 1 -> POLIGONO_REGULAR;
            case 2 -> CUADRADO;
            case 3 -> RECTANGULO;
            case 4 -> TRAPECIO;
            case 5 -> ROMBO;
            case 6 -> TRIANGULO;
            case 7 -> SALIR;
            default -> OPCION_ERRONEA;
        };
    }

    public static FiguraEnum getTrianguloEnumByTipo ( Integer tipo ){
        return switch ( tipo ) {
            case 1 -> EQUILATERO;
            case 2 -> ISOSCELES;
            case 3 -> ESCALENO;
            default -> OPCION_ERRONEA;
        };
    }

}
