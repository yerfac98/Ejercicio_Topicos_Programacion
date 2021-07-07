package Aplicacion7;

/**
 *
 * @author Gerardo Fac
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GestorEventosRollOver implements MouseListener {

    private Color colorAnterior;

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
        Component comp = e.getComponent();
        comp.setForeground(colorAnterior);
    }

    public void mouseEntered(MouseEvent e) {
        Component comp = e.getComponent();
        colorAnterior = comp.getForeground();
        comp.setForeground(java.awt.Color.BLUE);
    }
}

//Cambiar el codigo anterior en la clase GestorEventosRollOver por:

