package org.gerdoc.model.figura;

import org.gerdoc.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Figura implements SolicitaDatos
{
    public Figura()    {}
    public abstract double area( );
    public abstract double perimetro();
    public abstract String mostrarDatosFigura();
}