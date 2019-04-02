/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcappcontroller;

import java.util.HashMap;

/**
 *
 * @author Giovanni
 */
public class calcController {
    
    public static HashMap<String, calcInterface> myHashMapLink = new HashMap <String, calcInterface>();

    public calcController() {
    }
    public static Double calcHandler(String operationSymbol, Double firstNumber, Double secondNumber) {
            
        myHashMapLink.put("+", new calcAdd());
        myHashMapLink.put("-", new calcSubtract());
        myHashMapLink.put("*", new calcMultiply());
        myHashMapLink.put("/", new calcDivide());
        
        calcInterface organizer = myHashMapLink.get(operationSymbol);
        return(organizer.execute(firstNumber, secondNumber));
      
    }
    
}
