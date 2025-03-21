package org.soto.chavez.efren.model.figura.triangulos;

import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Escaleno extends Isosceles {
    private double lado3;

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3) {
        super(base, altura, lado1, lado2);
        this.lado3 = lado3;
    }
    public Escaleno() {
    }

    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriángulo Escaleno: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + ", " + lado2 + ", " + lado3 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
    @Override
    public void leeDatos() {
        super.leeDatos();
        lado3 = ReadUtil.readDouble(Salidas.leerLado(3));
    }

    @Override
    public void leerDatosVentana() {
        super.leerDatosVentana();
        lado3 = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(3)));
    }
}