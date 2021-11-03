package org.prog3.lab2.observer_observable_pattern.model;

import java.util.Observable;

/* This class generated numbers from 1 to 50 using method start().
 * When the number generated is a multiple of 5, Observable Counter notify his Observer (in this case Filter).
 */
public class Counter extends Observable {

        private int c;

        public Counter() {
            c = 0;
        }

        public int getC() {
            return c;
        }

        public void start() {

            for (int i=0; i<50; i++) {
                c++;
                if (c%5==0) {
                    setChanged();
                    notifyObservers();
                }
            }
        }
}