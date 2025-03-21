package org.pena.canuto.luis.enrique.vista;

import org.gerdoc.model.figura.Figura;

public class Menu
{
    public static void principal() {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Triángulo");
        System.out.println("3.- Círculo");
        System.out.println("4.- Polígono Regular");
        System.out.println("5.- Rectángulo");
        System.out.println("6.- Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void menuTriangulos() {
        System.out.println("SELECCIONA EL TIPO DE TRIÁNGULO");
        System.out.println("1.- Equilátero");
        System.out.println("2.- Isósceles");
        System.out.println("3.- Escaleno");
        System.out.println("4.- Volver al menú principal");
    }

    public static void principal2( )
    {
        System.out.println("WELCOME");
        System.out.println("PROGRAMA DE FIGURAS");
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println("La opción no es correcta");
    }

    public static void seleccionaOpcion( )
    {
        System.out.println("Dame una opción");
    }

    public static void errorDato( )
    {
        System.out.println("No es un dato valido");
    }

    public static void calcula(Figura figura )
    {
        System.out.println( "El área es:" + figura.area( ) );
        System.out.println( "El perímetro es:" + figura.perimetro( ) );
    }
    public static void leeLado( )
    {
        System.out.println( "Dame un lado" );
    }

    public static void leeBase( )
    {
        System.out.println( "Dame una base" );
    }

    public static void leeAltura( )
    {
        System.out.println( "Dame una altura" );
    }

    public static void leeLado1( )
    {
        System.out.println( "Dame un lado 1" );
    }

    public static void leeLado2( )
    {
        System.out.println( "Dame un lado 2" );
    }

    public static void leeLado3( )
    {
        System.out.println( "Dame un lado 3" );
    }

}
