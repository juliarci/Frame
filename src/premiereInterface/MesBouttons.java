package premiereInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MesBoutons extends JButton implements ActionListener {
    public MesBoutons() {
        super();
        initBouton();
    }

    public MesBoutons(String titre) {
        super(titre);
        initBouton();
    }

    public void initBouton() {
        this.addActionListener((ActionListener) this);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("Je suis le bouton "+this.getText()+" et je suis pressé hé hé");
}
}