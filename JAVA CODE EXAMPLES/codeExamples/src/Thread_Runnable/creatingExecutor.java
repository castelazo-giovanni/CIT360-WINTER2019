/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread_Runnable;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;  //library needs to be imported to use executor service
import java.util.concurrent.Executors;        //library needs to be imported to use executors
import java.io.*;
import java.text.*;


/**
 *
 * @author Giovanni
 */
public class creatingExecutor {

	public static void main(String[] args) {
            
        System.out.println("A prime number is a whole number greater than 1 whose only factors are 1 and itself. "
                + "\nA factor is a whole numbers that can be divided evenly into another number. "
                + "\nThe first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.\n"
                + "Think you know what prime numbers are now?  Type in 10 numbers that you thin are PRIME numbers and let's find out: ");
        
        int[] nums = new int[10];// set up array of 10
        for (int i = 0; i < 10; i++) // read in 10 numbers
        {
        System.out.println
        ("Enter a number."); // get a number
        int x; // number you entered
        try
        { InputStreamReader isr 
        = new InputStreamReader(System.in);
        BufferedReader br 
        = new BufferedReader(isr);
        String s = br.readLine(); 
        x = Integer.parseInt(s);
        nums[i] = x; // put the number in the array
        }
        catch(IOException e)
        { x = 0;
        }
        }
        for (int i = 0; i < 10; i++)
        {
        System.out.println(nums[i]); // print out the array
        }
         
         ExecutorService pool = Executors.newFixedThreadPool(5);  //preconfigured factory method
         
         for(int n : nums) {
        	 pool.execute( new PrimeTask(n));  // launches new task
         }
         pool.shutdown();  // Closes executor
	}
}

class PrimeTask implements Runnable{
	private int num;
	
	public PrimeTask(int num) {
		this.num = num;
	}
	
	@Override 
	public void run() {
		
	for(int i = 2;  i <= num/2; i ++){
            try {
                Thread.sleep(100);
            }
            catch(Exception ex) {
			
            }
            if ( num % i == 0 ){
		System.out.printf("\n%d  is NOT Prime... first divisible by " + i, num);
		return; 
            }
	}
		
	System.out.printf("\n%d  is Prime!", num);
		
	}
}