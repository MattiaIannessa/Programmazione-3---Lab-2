package org.prog3.lab2.swing_GUI.demo;

import org.prog3.lab2.swing_GUI.Controller;
import org.prog3.lab2.swing_GUI.View;

public class SwingGUIDemo {
    public static void main(String[]args){
        View v = new View();
        Controller c = new Controller(v);
        v.setController(c);
    }

}
