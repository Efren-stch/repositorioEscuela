package org.soto.chavez.efren.model.figura.cuadrilateros;
import org.soto.chavez.efren.model.figura.Cuadrado;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class Rectangulo extends Cuadrado {
    protected double lado2;
    public Rectangulo() {
    }
    public Rectangulo(double lado1, double lado2) {
        super(lado1);
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mRectángulo: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado1 + ", " + lado2 + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public double area() {
        return lado1 * lado2;
    }
    @Override
    public double perimetro() {
        return ( (lado1 * 2) + (lado2 * 2) );
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