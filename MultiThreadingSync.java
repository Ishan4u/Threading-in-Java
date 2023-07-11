/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * synchronized
 * allowing only one thread to execute it at a time and preventing data conflicts.
 */
class Table {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + " * " + n + " = " + n * i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

public class MultiThreadingSync {

    public static void main(String[] args) {
        Table t = new Table();

        // Thread 1
        Thread t1 = new Thread() {
            public void run() {
                t.printTable(5);
            }
        };
        
        // Thread 2
        Thread t2 = new Thread() {
            public void run() {
                t.printTable(10);
            }
        };
        
        t1.start();
        t2.start();
    }

}
