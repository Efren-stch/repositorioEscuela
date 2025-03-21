package org.pena.canuto.luis.enrique.model.figura;

import org.gerdoc.model.figura.Figura;
import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;

public class Cuadrado extends Figura
{

    private double lado1;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado1)
    {
        this.lado1 = lado1;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mCuadrado: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + "\n\t" + "Area = " + area() + "\n\t" + "Perimetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double area()
    {
        return lado1*lado1;
    }

    @Override
    public double perimetro()
    {
        return lado1*4;
    }

    @Override
    public void leeDatos()
    {
        Menu.leeLado( );
        lado1 = ReadUtil.readInt( );
    }

    public double getLado() {
        return lado1;
    }

    public void setLado1(double lado) {
        this.lado1 = lado;
    }

}
