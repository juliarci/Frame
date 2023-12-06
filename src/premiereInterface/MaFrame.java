package premiereInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MaFrame extends JFrame implements MouseListener {
    public MaFrame() {
        setSize(500, 300);
        setTitle("Voilà une fenêtre");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("souris cliquée de la fenetre");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("gouris preggee de la fenetre");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("souris relachée de la fenetre");
    }

    public void mouseEntered(MouseEvent e) {
        this.getContentPane().setBackground(Color.pink);
    }

    public void mouseExited(MouseEvent e) {
        this.getContentPane().setBackground(Color.green);
    }

}
