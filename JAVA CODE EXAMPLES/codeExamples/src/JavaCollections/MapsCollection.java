/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Giovanni
 */
public class MapsCollection {
    
     public static void main(String[] args) {
        
        //Create and populate new map
        //first field is the key, the second field is the value
        Map myMap = new HashMap();        
        myMap.put("firstname","Giovanni");
        myMap.put("lastname", "Castelazo");
        myMap.put("city", "Somewhere");
        myMap.put("state", "TX");

        // Output all items
        System.out.println(myMap);        
        
        // Replace value and output updated value       
        myMap.put("city", "Nowhere");
        System.out.println("\n" + myMap);
        
        // Add new key and value
        myMap.put("middlename", "NMI");
        System.out.println("\n" + myMap);
        
        // Get value from map
        System.out.println("\nThe value of firstname = " + myMap.get("firstname"));
        
        // Iterate through the map
        System.out.println("\nValues of the map are:");
        Set<String> keys = myMap.keySet();        
        keys.stream().forEach((key) -> {
            System.out.println(key + " is " + myMap.get(key));
        });
    }
    
}
