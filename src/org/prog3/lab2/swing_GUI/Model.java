package org.prog3.lab2.swing_GUI;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    public static class Proverbi{
        private final ArrayList<String> pro;

        public Proverbi(){
            pro = new ArrayList<>();
            for(int i=0;i<50;i++)
                pro.add("proverbio "+i);
        }

        public String getProverbio(){
            Random rand = new Random();
            return pro.get(rand.nextInt(50));
        }
    }
}
