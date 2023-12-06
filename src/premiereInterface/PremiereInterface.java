package premiereInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class PremiereInterface {
    public static void main(String[] args) {
        JFrame fen = new MaFrame();
        EcouteurSouris ecouteurSouris = new EcouteurSouris();
        JLabel jl1 = new JLabel("Superbe étiquette");
        JLabel jl2 = new JLabel("Magnifique étiquette");
        MesBoutons jb1 = new MesBoutons("B1");
        MesBoutons jb2 = new MesBoutons("B2");
        MesBoutons jb3 = new MesBoutons("B3");

        fen.addMouseListener(ecouteurSouris);

        Container fenCont = fen.getContentPane();
        fenCont.setLayout(new BorderLayout());


        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 3));
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        fenCont.add(jl1, BorderLayout.NORTH);
        fenCont.add(jp, BorderLayout.CENTER);
        fenCont.add(jl2, BorderLayout.SOUTH);
        fen.setVisible(true);
    }
}
