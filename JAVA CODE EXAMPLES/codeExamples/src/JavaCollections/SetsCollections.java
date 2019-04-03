/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Giovanni
 */
public class SetsCollections {
    
 public static void main(String args[]) {

        // Create and populate set - cannot have duplicates
        Set<String> firstSet = new HashSet();       
        firstSet.add("mustang");
        firstSet.add("camaro");
        firstSet.add("pilot");
        firstSet.add("odyssey");
        firstSet.add("323i");
        firstSet.add("accord");
        
        // Outpt the first set
        System.out.println("My first set: " + firstSet);
        

        // Create and populate list - can have duplicates
        List<String> listItem = new ArrayList<>();
        listItem.add("mustang");
        listItem.add("camaro");
        listItem.add("pilot");
        listItem.add("odyssey");
        listItem.add("323i");
        listItem.add("accord");
        listItem.add("pilot");
        listItem.add("odyssey");
        listItem.add("323i");
        listItem.add("accord");        
        
        // Output the list
        System.out.println("\nMy list: " + listItem
                           + "\n Look at all the duplicates");
        
         
        // Now create the second set using the list
        Set<String> createdSet = new HashSet(listItem);
        
        //Output the list
        System.out.println("\nSecond set created: " + createdSet);
        
        //Compare both sets to see if they match
        if (firstSet.equals(createdSet)){
            System.out.println("Notice there are no duplicate values.\n");
        } else {
            System.out.println("Something went wrong. There should be no duplicates.\n");
        }

        // Verify one of each item from the list is there
        if (firstSet.containsAll(listItem)){
            System.out.println("YES!!! One of each item is accounted for."); 
        } else {
            System.out.println("OH NO!!! You missed some.");
        }
        
        if (createdSet.containsAll(listItem)){
            System.out.println("YES!!! One of each item is accounted for."); 
        } else {
            System.out.println("OH NO!!! You missed some.");
        }


        // Output the number of items for each
        System.out.println("\nMy first set has: " + firstSet.size() + " items");
        System.out.println("My list has: " + listItem.size() + " items");
        System.out.println("The created set has: " + createdSet.size() + " items");


    }
    
}
