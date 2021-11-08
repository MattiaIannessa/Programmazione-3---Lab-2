package org.prog3.lab2.swing_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private final Model.Proverbi p = new Model.Proverbi();
    private final View v;

    public Controller(View v){
        this.v = v;
    }

    public void actionPerformed(ActionEvent e) {
        this.v.setText(p.getProverbio());
    }
}
