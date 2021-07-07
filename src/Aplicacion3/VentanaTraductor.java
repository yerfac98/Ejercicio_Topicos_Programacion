/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gerardo Fac
 */
public class VentanaTraductor extends JFrame implements ActionListener {

    private Traductor traductor;
    private JTextField campo;
    private JButton boton;

    private JLabel etiqueta;

    public VentanaTraductor(Traductor traductor) {
        this.traductor = traductor;
        this.setTitle("Traductor de Español a Ingles");

        JPanel panelContenido = new JPanel();

        this.setContentPane(panelContenido);

        boton = new JButton("Traductor");
        etiqueta = new JLabel("Pulsa el boton para traducir");
        campo = new JTextField(20);

        boton.addActionListener(this);
        panelContenido.add(campo);
        panelContenido.add(boton);
        panelContenido.add(etiqueta);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText(traductor.traducePalabra(campo.getText()));

    }

}
