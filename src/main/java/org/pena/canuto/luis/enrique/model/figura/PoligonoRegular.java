package org.pena.canuto.luis.enrique.model.figura;

import org.gerdoc.model.figura.Figura;
import org.pena.canuto.luis.enrique.util.ReadUtil;
import org.pena.canuto.luis.enrique.vista.Menu;

public class PoligonoRegular extends Figura {
    protected double lado;
    protected double apotema;
    protected int lados;

    public PoligonoRegular() {
    }
    public PoligonoRegular(double lado, double apotema, int lados) {
        this.lado = lado;
        this.apotema = apotema;
        this.lados = lados;
    }

    @Override
    public double area() {
        return perimetro() * apotema /2;
    }

    @Override
    public double perimetro() {
        return lado * lados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        if (lados > 3) {
            this.lados = lados;
        } else {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 lados.");
        }
    }
    @Override
    public String mostrarDatosFigura() {
        return "\u001B[31mPolígono Regular: \u001B[0m" + "\n\t" + "\u001B[34mLados = " + lado + ", Número de lados = " + lados + "\n\t" + "Área = " + area() + "\n\t" + "Perímetro = " + perimetro()
                + "\u001B[0m";
    }
    @Override
    public void leeDatos() {
        Menu.leeLado();
        lado = ReadUtil.readInt();
        Menu.leeAltura();
        apotema = ReadUtil.readInt();
        System.out.println("Ingrese el número de lados:");
        lados = ReadUtil.readInt();
    }
}
