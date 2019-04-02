/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcappcontroller;
import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class calcAPPController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Calculator variables
        Scanner input = new Scanner(System.in);
        Double firstNumber;
        Double secondNumber;            
        String operationSymbol;
        
        // Takes user's first number
        System.out.println("Let's do some math!!"
                + "\nEnter the first number");
        firstNumber = Double.parseDouble(input.nextLine());
        
        // Takes user's desired operation
        System.out.println("What math should we do?"
                + "\nEnter + to add"
                + "\nEnter - to subtract"
                + "\nEnter * to multiply by"
                + "\nEnter / to divide by");
        operationSymbol = input.nextLine();
         
        // Takes user's second number
        System.out.println("Enter a second number");
        secondNumber = Double.parseDouble(input.nextLine());
        
        // Calls controller and displays answer
        System.out.println("The answer is: ");
        System.out.println(calcController.calcHandler(operationSymbol, firstNumber, secondNumber));          
    
    }
    
}
