package org.soto.chavez.efren.model.figura.cuadrilateros;

import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Trapecio extends Rectangulo {
    private double lado3;
    private double altura;
    public Trapecio() {
    }
    public Trapecio(double lado1, double lado2, double lado3, double altura) {
        super(lado1, lado2);
        this.lado3 = lado3;
        this.altura = altura;
    }

    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mTrapecio: \u001B[0m" + "\n\t" + "\u001B[34mBase menor = " + lado1 + ", Base mayor = " + lado2 + ", Altura = " + altura + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double area() {
        return (lado1 + lado2) / 2 * altura;
    }
    @Override
    public double perimetro() {
        return lado1 + lado2 + (2*lado3);
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        lado3 = ReadUtil.readDouble(Salidas.leerLado(3));
        altura = ReadUtil.readDouble(Salidas.leerAltura);
    }
    @Override
    public void leerDatosVentana() {
        super.leerDatosVentana();
        lado3 = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(3)));
        altura = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerAltura));
    }
}