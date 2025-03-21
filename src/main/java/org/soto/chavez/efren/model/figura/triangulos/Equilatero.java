package org.soto.chavez.efren.model.figura.triangulos;

import org.soto.chavez.efren.model.figura.Triangulo;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Equilatero extends Triangulo {
    protected double lado1;

    public Equilatero(double base, double altura, double lado1) {
        super(base, altura);
        this.lado1 = lado1;
    }
    public Equilatero() {
    }

    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriángulo Equilátero: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double perimetro() {
        return lado1 * 3;
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        lado1 = ReadUtil.readDouble(Salidas.leerLado(0));
    }
    @Override
    public void leerDatosVentana() {
        super.leerDatosVentana();
        lado1 = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(0)));
    }
}