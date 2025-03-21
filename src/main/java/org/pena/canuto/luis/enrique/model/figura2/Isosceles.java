package org.pena.canuto.luis.enrique.model.figura2;

import org.pena.canuto.luis.enrique.model.figura.Equilatero;
import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;


public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles()
    {
    }

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public double getLado2()
    {
        return lado2;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTriángulo Isósceles: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + ", " + lado2 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double perimetro()
    {
        return 2*lado1+ lado2;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readInt( );
    }
}
