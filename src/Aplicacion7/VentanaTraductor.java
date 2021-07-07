package Aplicacion7;

import javax.swing.JFrame;

/**
 *
 * @author Gerardo Fac
 */
public class VentanaTraductor extends JFrame {

    public VentanaTraductor(Traductor traductor) {
        this.setContentPane(new PanelTraductor(traductor));
        this.setTitle("Traductor de ingles a español");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setVisible(true);

//Cambiar el codigo anterior en la clase GestorEventosRollOver por:
        
    }

}
