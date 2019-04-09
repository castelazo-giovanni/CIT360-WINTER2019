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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni
 */
public class SetsCollectionsTest {
    
    public SetsCollectionsTest() {
    }

    /**
     * Test of main method, of class SetsCollections.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        /* Commented out the following line so that I don't see all the output
        from the SetsCollections.java class.  I only want to see my test
        results */
        //SetsCollections.main(args);

        
        Set<String> firstSet = new HashSet();       
        firstSet.add("mustang");
        firstSet.add("camaro");
        firstSet.add("pilot");
        firstSet.add("odyssey");
        firstSet.add("323i");
        firstSet.add("accord");
        
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
        
        Set<String> createdSet = new HashSet(listItem);
        
        Integer firstSize = firstSet.size();
        Integer createdSize = createdSet.size();
        Integer listSize = listItem.size();
        
        //Show my test outputs
        
        assertNull(args);
        System.out.println("\nTest 1: assertNull Test - Verify String[] args is null");
                
        assertNotSame (firstSet, listItem);
        System.out.println("Test 2: assertNotSame Test - Verify firstSet and listSet are different");
        
        assertNotNull(createdSet);
        System.out.println("Test 3: assertNotNull Test - Verify createdSet is not NULL");
        
        assertEquals(firstSize, createdSize);
        System.out.println("Test 4: assertEquals Test - Verify firstSet and createdSet are the same size");
        
        assertTrue(firstSize < listSize);
        System.out.println("Test 5: assertTrue Test - Verify firstSet has less elements than listItem");
        
        assertFalse(createdSize > listSize);
        System.out.println("Test 6: assertFalse Test - Verify listItem has more elements than createdSet");

    }
    
}
