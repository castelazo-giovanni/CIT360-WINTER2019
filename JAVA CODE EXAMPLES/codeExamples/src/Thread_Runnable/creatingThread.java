/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_Runnable;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class creatingThread {
        public static void main(String args[]) {
        Long myNum;
        
        System.out.println("A prime number is a whole number greater than 1 whose only factors are 1 and itself. "
                + "\nA factor is a whole numbers that can be divided evenly into another number. "
                + "\nThe first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.\n"
                + "Think you know what prime numbers are now?  Type in a number (above 29) to see if it is a prime number: ");
        Scanner scanner = new Scanner(System.in);               
        String value = scanner.nextLine(); 
        myNum = Long.parseLong(value); 
    
        MyCalculationsThread mc = new MyCalculationsThread(myNum, "myChildThread");

        Thread mainThread = Thread.currentThread(); // main thread

        System.out.println("Active threads for this thread group: " + Thread.activeCount());
    }
}

class MyCalculationsThread extends Thread {                   // Extending Thread.  Makes Thread my superclass
    private long numberToFactor = 0;

    MyCalculationsThread(long numberToFactor, String threadName){  // MyCalculationsThread is my subclass
        super(threadName);
        this.numberToFactor = numberToFactor;
        start();  // this invokes run()
    }

    @Override
    public void run() { // this is where the new thread starts
        isItPrime();
    }

    private void isItPrime() { // only designed to work with odd numbers
        double squareRoot = Math.sqrt(numberToFactor);
        int i;
        for ( i = 2; i <= squareRoot; i++) {
            if (numberToFactor%i== 0) { // when the remainder is 0 the number is evenly divisible - hence not prime
                System.out.println("\n" + numberToFactor + " is NOT Prime ... first divisible by " + i);
                return;
            }
        }
        System.out.println("\n" + numberToFactor + " is Prime!");
        return;
    }
}