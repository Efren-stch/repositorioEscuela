package org.soto.chavez.efren.model.figura;
import org.gerdoc.model.figura.Figura;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public abstract class Triangulo extends Figura {
    protected double base;
    protected double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo() {
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double area() {
        return (base * altura)/2;
    }

    public abstract double perimetro();

    @Override
    public void leeDatos() {
        base = ReadUtil.readDouble(Salidas.leerBase);
        altura = ReadUtil.readDouble(Salidas.leerAltura);
    }
    @Override
    public void leerDatosVentana() {
        base = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerBase));
        altura = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerAltura));
    }


}