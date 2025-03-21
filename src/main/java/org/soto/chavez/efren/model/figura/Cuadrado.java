package org.soto.chavez.efren.model.figura;

import org.gerdoc.model.figura.Figura;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Cuadrado extends Figura {
    protected double lado1;

    public Cuadrado(double lado1) {
        this.lado1 = lado1;
    }
    public Cuadrado() {
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCuadrado: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro()
                + "\u001B[0m";
    }

    @Override
    public double area(){
        return lado1 * lado1;
    }
    @Override
    public double perimetro() {
        return lado1 * 4;
    }

    @Override
    public void leeDatos() {
        lado1 = ReadUtil.readDouble(Salidas.leerLado(0));
    }

    @Override
    public void leerDatosVentana() {
        lado1 = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(0)));
    }
}