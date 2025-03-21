package org.pena.canuto.luis.enrique.util;

import org.gerdoc.model.figura.Figura;
import org.pena.canuto.luis.enrique.model.figura.*;
import org.pena.canuto.luis.enrique.model.figura2.Escaleno;
import org.pena.canuto.luis.enrique.model.figura2.Isosceles;
import org.pena.canuto.luis.enrique.model.figura3.Rectangulo;

public class FiguraFactory
{

    public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        switch ( figuraEnum )
        {
            case CUADRADO:
                return new Cuadrado();
            case RECTANGULO:
                return new Rectangulo();
            case CIRCULO:
                return new Circulo();
            case POLIGONO:
                return new PoligonoRegular();
            case ESCALENO:
                return new Escaleno();
            case ISOSCELES:
                return new Isosceles();
            case EQUILATERO:
                return new Equilatero();
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}

