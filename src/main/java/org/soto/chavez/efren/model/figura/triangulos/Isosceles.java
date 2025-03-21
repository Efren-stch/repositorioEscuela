package org.soto.chavez.efren.model.figura.triangulos;

import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Isosceles extends Equilatero {
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2) {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }
    public Isosceles() {
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriángulo Isósceles: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + ", " + lado2 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double perimetro() {
        return lado1 + (lado2 * 2);
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        lado2 = ReadUtil.readDouble(Salidas.leerLado(2));
    }

    @Override
    public void leerDatosVentana() {
        super.leerDatosVentana();
        lado2 = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(2)));
    }
}