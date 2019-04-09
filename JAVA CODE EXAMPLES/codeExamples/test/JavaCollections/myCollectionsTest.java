/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giovanni
 */
public class myCollectionsTest {
    
    public myCollectionsTest() {
    }

    /**
     * Test of main method, of class myCollections.
     */
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] a = null;        
        //myCollections.main(a);
        
        List<Integer> myList = new ArrayList<>();
        ListIterator<Integer> myNum = null;
        myList.add(38);
        myList.add(74);
        myList.add(52);
        myList.add(12);
        myList.add(27);
        myNum=myList.listIterator();
        
               
        assertNull(a);
        System.out.println("Test 1: assertNull Test - Verify String[] a is null");
      
       assertNotNull(myNum);
       System.out.println("Test 2: assertNotNull Test - Test Array after it is populated. Verify not null");
       

       
    }
    
}
