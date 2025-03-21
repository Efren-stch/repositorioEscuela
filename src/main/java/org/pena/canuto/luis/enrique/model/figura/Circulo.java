package org.pena.canuto.luis.enrique.model.figura;

import org.gerdoc.model.figura.Figura;
import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;

public class Circulo extends Figura {
    protected double radio;

    public Circulo() {
    }

    @Override
    public double area() {
        return radio * radio * Math.PI;
    }

    @Override
    public double perimetro() {
        return radio * 2 * Math.PI;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCírculo: \u001B[0m" + "\n\t" + "\u001B[34mRadio = " + radio + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public void leeDatos() {
        Menu.leeLado();
        radio = ReadUtil.readInt();
    }
}