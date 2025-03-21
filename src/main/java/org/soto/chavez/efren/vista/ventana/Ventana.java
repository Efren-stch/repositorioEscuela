package org.soto.chavez.efren.vista.ventana;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;
import org.soto.chavez.efren.model.figura.*;
import org.soto.chavez.efren.model.figura.cuadrilateros.*;
import org.soto.chavez.efren.model.figura.triangulos.*;
import org.soto.chavez.efren.generalUtil.*;

import javax.swing.*;
public class Ventana extends JFrame implements Ejecutable {
    private Historiales historiales;
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private Figura figura;

    private Ventana() {
        super( "Programa de Figuras" );
        init();
    }
    public Figura triangulos() {
        String[] opciones = { "Equilátero", "Isósceles", "Escaleno" };
        int opcion = JOptionPane.showOptionDialog(
                this,
                "Seleccione el tipo de triángulo:",
                "Menú de Triángulos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        switch (opcion) {
            case 0 -> { return new Equilatero(); }
            case 1 -> { return new Isosceles(); }
            case 2 -> { return new Escaleno(); }
            default -> { Salidas.opcionInvalida(); return null; }
        }
    }
    private void init () {
        jLabel = VentanaElementos.menuFiguras();

        JTextField jTextFieldPrincipal = new JTextField();
        jTextFieldPrincipal.setBounds(10, 180, 70, 20);

        jButton = new JButton(Salidas.seleccionarOpcion);
        jButton.setBounds(120, 180, 100, 20);

        getContentPane().setLayout(null);
        getContentPane().add(jLabel);
        getContentPane().add(jTextFieldPrincipal);
        getContentPane().add(jButton);

        jButton.addActionListener((event) -> {
            int opcion = ReadUtil.stringAEntero(jTextFieldPrincipal.getText());
            if(opcion == 7) {
                dispose();
            } else {
                switch (opcion) {
                    case 1 -> figura = new PoligonoRegular();
                    case 2 -> figura = new Cuadrado();
                    case 3 -> figura = new Rectangulo();
                    case 4 -> figura = new Trapecio();
                    case 5 -> figura = new Rombo();
                    case 6 -> figura = triangulos();
                    default -> Salidas.opcionInvalida();
                }
                if (figura != null) {
                    ((SolicitaDatos) figura).leerDatosVentana();
                    VentanaElementos.imprimirResultado(Salidas.imprimirResultado(figura));
                    if( historiales != null )
                    {
                        historiales.addFigura( figura );
                    }
                }
            }
        });
    }

    public static Ventana getInstance( ) {
        if( ventana == null ) {
            ventana = new Ventana();
        }
        return ventana;
    }
    @Override
    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }

    @Override
    public void run() {
        setBounds(100, 100, 300, 250);
        setVisible(true);
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

}