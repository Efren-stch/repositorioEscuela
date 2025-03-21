package org.pena.canuto.luis.enrique.model.figura;

import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;

public enum FiguraEnum {
    CUADRADO(1),
    CIRCULO(2),
    POLIGONO(3),
    RECTANGULO(4),
    EQUILATERO(5),
    ISOSCELES(6),
    ESCALENO(7),
    SALIR(8),
    OPCION_ERRONEA(9);
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

    public static FiguraEnum getFiguraEnumById( Integer id ){
        switch ( id ) {
            case 1:
                return CUADRADO;
            case 2:
                Menu.menuTriangulos();
                int idTriangulo = ReadUtil.readInt();
                switch ( idTriangulo ){
                    case 1:
                        return EQUILATERO;
                    case 2:
                        return ISOSCELES;
                    case 3:
                        return ESCALENO;
                }
            case 3:
                return CIRCULO;
            case 4:
                return POLIGONO;
            case 5:
                return RECTANGULO;
            case 6:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
