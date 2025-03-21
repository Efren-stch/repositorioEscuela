package org.soto.chavez.efren.generalUtil;

import org.gerdoc.model.figura.Figura;

public class Salidas {
    //Menus
    public static String principal = (
        "Bienvenido al programa!\n" +
        "PROGRAMA DE FIGURAS\n" +
        "SELECCIONA UNA OPCION\n" +
        "1.- Consola\n" +
        "2.- Ventana\n" +
        "3.- Salir"
    );
    public static String principalFiguras = (
        "---- Menú ----\n" +
        "¿Qué operación desea realizar?:\n" +
        "Calcular el área y perímetro de...\n" +
        "1. Polígono Regular de más de 4 lados\n" +
        "2. Cuadrado\n" +
        "3. Rectángulo\n" +
        "4. Trapecio\n" +
        "5. Rombo\n" +
        "6. Triángulo\n" +
        "7. Salir del programa"
    );
    public static String principalTriangulos = (
        "¿Qué tipo de triángulo?: \n" +
        "1. Equilatero\n" +
        "2. Isoceles\n" +
        "3. Escaleno"
    );
    public static String leerLado(int lado) {
        if (lado == 0){
            return "¿Cuánto mide un lado?";
        } else {
            return "¿Cuánto mide el lado " + lado + "?";
        }
    }
    public static String leerNumeroLados = "¿Cuántos lados tiene el polígono? (entre 5 y 100): ";
    public static String leerApotema = "¿Cuánto mide la apotema?";
    public static String leerBase = "Cuánto mide la base?: ";
    public static String leerAltura = "¿Cuánto mide la altura?";
    public static String leerDiagonalMayor = "¿Cuánto mide la diagonal mayor?: ";
    public static String leerDiagonalMenor = "¿Cuánto mide la diagonal menor?: ";
    public static String seleccionarOpcion = "Selecciona una opción: ";
    public static void opcionInvalida() {
        System.out.println("La opción no es correcta");
    }
    public static void errorDato() {
        System.out.println("No es un dato valido");
    }
    public static void terminarPrograma(){
        System.out.println("¡Hasta luego!");
        System.out.println("No olvides cerrar la ventana si aún sigue abierta");
    }
    public static String imprimirResultado(Figura figura){
        return (
                "Perímetro de la figura: " + figura.perimetro() + "\n" +
                "Área de la figura: " + figura.area()
        );
    }
}