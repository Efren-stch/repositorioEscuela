package org.soto.chavez.efren.model.figura.cuadrilateros;

import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Rombo extends Rectangulo {
    private double diagonalMayor;
    private double diagonalMenor;
    public Rombo() {
    }
    public Rombo(double lado1, double lado2, double diagonalMayor, double diagonalMenor) {
        super(lado1, lado2);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mRombo: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Diagonal Mayor = " + diagonalMayor + "\n\t" + "Diagonal Menor = " + diagonalMenor
                + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double perimetro() {
        return super.perimetro();
    }
    @Override
    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        diagonalMayor = ReadUtil.readDouble(Salidas.leerDiagonalMayor);
        diagonalMenor = ReadUtil.readDouble(Salidas.leerDiagonalMenor);
    }

    @Override
    public void leerDatosVentana() {
        super.leerDatosVentana();
        diagonalMayor = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerDiagonalMayor));
        diagonalMenor = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerDiagonalMenor));

    }
}