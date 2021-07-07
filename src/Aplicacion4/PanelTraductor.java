/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion4;

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
public class PanelTraductor extends JPanel implements ActionListener {

    
    private JTextField campo;
    private JButton boton;
    private JLabel etiqueta;
    private final Traductor traductor;
    
    public  PanelTraductor (Traductor traductor){
        this.traductor=traductor;
      



        boton = new JButton("Traductor");
        etiqueta = new JLabel("Pulsa el boton para traducir");
        campo = new JTextField(20);

        boton.addActionListener(this);
        this.add(campo);
        this.add(boton);
        this.add(etiqueta);

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText(traductor.traducePalabra(campo.getText()));

    }

}

        
    
    
    
