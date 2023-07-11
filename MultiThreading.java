/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package multithreading;

/**
 *
 * MultiThreading
 */
class Book {

    void updateDb() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating Db");
        }
    }
    
}

class Num {

    void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) { //thread
        
        //creating object for the class
        Book book = new Book();
        Num num = new Num();
        
        book.updateDb();
        num.print();
        
    }
}
