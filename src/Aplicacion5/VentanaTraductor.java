/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion5;


import javax.swing.JFrame;

/**
 *
 * @author Gerardo Fac
 */
public class VentanaTraductor extends JFrame {
    
    public VentanaTraductor(Traductor traductor){
        this.setContentPane(new PanelTraductor(traductor));
        this.setTitle("Traductor de ingles a español");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setVisible(true);
        

        
    }
    
}
