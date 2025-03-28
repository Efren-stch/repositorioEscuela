package org.pena.canuto.luis.enrique.vista;

import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.pena.canuto.luis.enrique.model.figura.Cuadrado;
import org.pena.canuto.luis.enrique.util.ReadUtil;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private Historiales historiales;
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private Figura figura;

    private Ventana( )
    {
        super( "Programa de figuras" );
        init( );
    }

    private void init()
    {
        jLabel = new JLabel( "Dame un lado" );
        jLabel.setBounds( 10, 10, 100, 20);
        jTextField = new JTextField( );
        jTextField.setBounds( 120, 10, 100, 20);
        jButton = new JButton( "Calcular" );
        jButton.setBounds( 10, 40, 100, 20);

        getContentPane().setLayout( null );
        //System.out.println(getContentPane().getLayout().getClass().toString());
        getContentPane().add( jLabel );
        getContentPane().add( jTextField );
        getContentPane().add( jButton );

        jButton.addActionListener( (event) ->{
                    figura = new Cuadrado( );
                    ((Cuadrado)figura).setLado1(ReadUtil.string2Integer( jTextField.getText( ) ) );
                    System.out.println( figura.area( ) );
                    System.out.println( figura.perimetro( ) );
                    if( historiales != null )
                    {
                        historiales.addFigura( figura );
                    }
                }
        );
    }

    public static Ventana getInstance( )
    {
        if(ventana==null)
        {
            ventana=new Ventana();
        }
        return ventana;
    }

    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
    @Override
    public void run()
    {
        setBounds( 100, 100, 300, 200);
        setVisible( true );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

}
