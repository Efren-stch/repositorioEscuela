package org.gerdoc.model.figura;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;

/**
 * 
 */
public class Equilatero extends Triangulo
{

    protected double lado1;

    public Equilatero()
    {
    }

    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado1 = lado1;
    }

    public double getLado1() {

        return lado1;
    }

    /**
     * @param lado1
     */
    public void setLado(double lado1)
    {
        this.lado1 = lado1;
    }

    /**
     * @return
     */
    @Override
    public  double perimetro()
    {
        return lado1*3;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriángulo Equilátero: \u001B[0m" + "\n\t" + "\u001B[34mLado = " + lado1 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado1( );
        lado1 = ReadUtil.readInt( );
    }
}