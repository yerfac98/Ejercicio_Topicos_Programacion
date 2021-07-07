/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion6;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gerardo Fac
 */
public class PanelTraductor extends JPanel implements ActionListener, MouseListener {
    
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
        
        campo.addMouseListener(this);
        boton.addMouseListener(this);
        etiqueta.addMouseListener(this);
        botonCambioIdioma.addMouseListener(this);
        etiquetaIdioma.addMouseListener(this);
        
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
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
        Component component = e.getComponent();
        colorAnterior = component.getForeground();
        component.setForeground(java.awt.Color.BLUE);
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        Component component = e.getComponent();
        component.setForeground(colorAnterior);
        
    }
    
}
