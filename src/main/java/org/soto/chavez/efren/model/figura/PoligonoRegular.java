package org.soto.chavez.efren.model.figura;

import org.gerdoc.model.figura.Figura;
import org.soto.chavez.efren.generalUtil.ReadUtil;
import org.soto.chavez.efren.generalUtil.Salidas;
import org.soto.chavez.efren.vista.ventana.VentanaElementos;

public class PoligonoRegular extends Figura {
    private double apotema;
    private int lados;
    private double lado;
    public PoligonoRegular(int lados, double apotema, double lado) {
        this.lados = lados;
        this.apotema = apotema;
        this.lado = lado;
    }
    public PoligonoRegular() {
    }
    public double getApotema() {
        return apotema;
    }
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double perimetro() {
        return lado * lados;
    }
    public double area(){
        return (perimetro() * apotema)/2;
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mPolígono Regular: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado + ", Número de lados = " + lados + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public void leeDatos() {
        lados = ReadUtil.readInt(Salidas.leerNumeroLados, 5, 100);
        lado = ReadUtil.readDouble(Salidas.leerLado(0));
        apotema = ReadUtil.readDouble(Salidas.leerApotema);
    }
    @Override
    public void leerDatosVentana() {
        lados = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerNumeroLados));
        lado = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerLado(0)));
        apotema = ReadUtil.stringAEntero(VentanaElementos.pedirEntrada(Salidas.leerApotema));
    }
}