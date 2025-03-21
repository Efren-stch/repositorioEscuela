package org.soto.chavez.efren.model.figura.util;

import org.gerdoc.model.figura.Figura;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.model.figura.Cuadrado;
import org.soto.chavez.efren.model.figura.PoligonoRegular;
import org.soto.chavez.efren.model.figura.cuadrilateros.Rectangulo;
import org.soto.chavez.efren.model.figura.cuadrilateros.Rombo;
import org.soto.chavez.efren.model.figura.cuadrilateros.Trapecio;
import org.soto.chavez.efren.model.figura.triangulos.Equilatero;
import org.soto.chavez.efren.model.figura.triangulos.Escaleno;
import org.soto.chavez.efren.model.figura.triangulos.Isosceles;

public class FiguraFactory {
    private static Figura getTriaguloByFiguraEnum (FiguraEnum figuraEnum ) {
        switch ( figuraEnum ) {
            case EQUILATERO:
                return new Equilatero();
            case ISOSCELES:
                return new Isosceles();
            case ESCALENO:
                return new Escaleno();
            default:
                return null;
        }
    }
   public static Figura getFiguraByFiguraEnum ( FiguraEnum figuraEnum ){
       switch ( figuraEnum ) {
           case CUADRADO:
               return new Cuadrado();
           case RECTANGULO:
               return new Rectangulo();
           case ROMBO:
               return new Rombo();
           case TRAPECIO:
               return new Trapecio();
           case POLIGONO_REGULAR:
               return new PoligonoRegular();
           case TRIANGULO:
               System.out.println(Salidas.principalTriangulos);
               getTriaguloByFiguraEnum(FiguraEnum.getTrianguloEnumByTipo(ReadUtil.readInt(Salidas.seleccionarOpcion, 1, 3)));
           case SALIR:
           case OPCION_ERRONEA:
           default:
               return null;
       }
   }
}
