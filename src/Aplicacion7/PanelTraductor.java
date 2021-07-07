package Aplicacion7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gerardo Fac
 */
public class PanelTraductor extends JPanel implements ActionListener {

    private JTextField campo;
    private JButton boton;
    private JLabel etiqueta;
    private final Traductor traductor;

    private JButton botonCambioIdioma;
    private JLabel etiquetaIdioma;

    private Color colorAnterior;

    public PanelTraductor(Traductor traductor) {
        this.traductor = traductor;

        campo = new JTextField(20);
        boton = new JButton("Traductor");
        etiqueta = new JLabel("Pulsa el boton para traducir");

        botonCambioIdioma = new JButton("Invertir sentido Traduccion");
        etiquetaIdioma = new JLabel();
        this.muestraSentidoTraduccion();

        boton.addActionListener(this);
        campo.addActionListener(this);
        botonCambioIdioma.addActionListener(this);

        GestorEventosRollOver gestor = new GestorEventosRollOver();
        etiqueta.addMouseListener(gestor);
        campo.addMouseListener(gestor);
        boton.addMouseListener(gestor);
        botonCambioIdioma.addMouseListener(gestor);
        etiquetaIdioma.addMouseListener(gestor);

        this.add(campo);
        this.add(boton);
        this.add(etiqueta);
        this.add(botonCambioIdioma);
        this.add(etiquetaIdioma);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonCambioIdioma) {
            traductor.invierteIdioma();
            this.muestraSentidoTraduccion();

        } else {
            etiqueta.setText(traductor.traducePalabra(campo.getText()));
        }
    }

    private void muestraSentidoTraduccion() {
        etiquetaIdioma.setText(traductor.getCadenaIdioma(traductor.getIdiomaOrigen())
                + " - " + traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
    }

}
