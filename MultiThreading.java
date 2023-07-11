/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * MultiThreading
 * allowing multiple tasks to run simultaneously and independently.
 */
class Book implements Runnable { //Multiple inheritance is not allowed in Java; therefore, we use the Runnable interface.

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
    
}

class Num extends Thread{

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
        Runnable book = new Book(); // book - thread
        Num num = new Num();
        
//        book.updateDb();
       Thread t1 =new Thread(book);
       t1.start();
        
//        num.print();
        num.start();
        
        
        
        
        num.join();
        
        
        
        System.out.println("Bye");
    }
}
