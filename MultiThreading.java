/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * MultiThreading allowing multiple tasks to run simultaneously and
 * independently.
 */
class Num extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000); //Introduced delay to pause execution for a specified duration
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException { //thread

        //creating object for the class
        Runnable book = new Runnable() 
        { // anonymous class for book
            public void run() { //run
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Updating Db");
                    try {
                        Thread.sleep(4000); //Introduced delay to pause execution for a specified duration
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };

        Num num = new Num();

//        book.updateDb();
        Thread t1 = new Thread(book); // instance of thread for book
        t1.start();

//        num.print();
        num.start();
        
        t1.join();
        num.join();

        System.out.println("Bye");
    }
}
