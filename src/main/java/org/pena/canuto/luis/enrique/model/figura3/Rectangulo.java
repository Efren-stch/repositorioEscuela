package org.pena.canuto.luis.enrique.model.figura3;

import org.gerdoc.model.figura.Figura;
import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {

    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mRectángulo: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + base + ", " + altura + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void leeDatos() {
        Menu.leeBase();
        base = ReadUtil.readInt();
        Menu.leeAltura();
        altura = ReadUtil.readInt();
    }

}
