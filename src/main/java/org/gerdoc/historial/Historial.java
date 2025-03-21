package org.gerdoc.historial;

import org.gerdoc.model.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historial implements Historiales{
    private static Historial historial;
    private static List<Figura> listFigura;

    public Historial() {
    }

    public static Historial getInstance(){
        if ( historial == null ){
            historial = new Historial();
        }
        return historial;
    }

    @Override
    public void imprimir()
    {
        if( listFigura == null || listFigura.isEmpty( ) )
        {
            System.out.println( "lista vacia");
            return;
        }
        listFigura.forEach( f -> {
            System.out.println(f.mostrarDatosFigura());
        });
    }

    @Override
    public void addFigura(Figura figura) {
        if ( listFigura == null ){
            listFigura = new ArrayList<>();
        }
        listFigura.add( figura );
    }
}
