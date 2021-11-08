package org.prog3.lab2.swing_GUI;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{

    private final Button btn_chiediProverbio;
    private final Label lbl_proverbio;

    public View(){
        super("Proverbi");
        setSize(400, 200);

        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
        btn_chiediProverbio = new Button("Chiedi proverbio");
        lbl_proverbio = new Label("Clicca il pulsante");

        add(btn_chiediProverbio);
        add(lbl_proverbio);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setController(Controller c) {
        btn_chiediProverbio.addActionListener(c); // aggancia il listener del controller al bottone
    }

    public void setText(String text){
        lbl_proverbio.setText(text);
    }
}