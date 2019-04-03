/*
Code example for java collections
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;


/**
 *
 * @author Giovanni
 */
public class myCollections {
    
        public static void main(String a[]){
        List<Integer> myList = new ArrayList<>();
        ListIterator<Integer> myNum = null;
        myList.add(38);
        myList.add(74);
        myList.add(52);
        myList.add(12);
        myList.add(27);
        myNum=myList.listIterator();
        System.out.println("Elements in forward directiton");
        while(myNum.hasNext()){
            System.out.println(myNum.next());
        }
        System.out.println("Elements in backward directiton");
        while(myNum.hasPrevious()){
            System.out.println(myNum.previous());
        }
        
        System.out.println("Elements sorted in ascending order: ");
        
        Collections.sort(myList);

        for(int i=0; i<myList.size();i++ )
        {
            System.out.println(myList.get(i));
        }

    }    
 }
