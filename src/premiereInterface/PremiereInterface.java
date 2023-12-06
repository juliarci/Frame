package premiereInterface;

import javax.swing.*;

public class PremiereInterface {
    public static void main(String[] args){
        JFrame fen = new MaFrame();
        JLabel jl1= new JLabel("Superbe étiquette");
        fen.getContentPane().add(jl1);
        fen.setVisible(true);
    }
}
