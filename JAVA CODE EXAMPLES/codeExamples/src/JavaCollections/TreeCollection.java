/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.TreeSet;
import java.util.Iterator;


/**
 *
 * @author Giovanni
 */
public class TreeCollection {

    public static void main(String[] args) {
	TreeSet<Integer> mytree = new TreeSet<Integer>();
	mytree.add(38);
	mytree.add(74);
	mytree.add(52);
	mytree.add(12);
        mytree.add(57);
        
        // Output how list was inputed
        System.out.println("List was inputted in the following order:"
                + "  38, 74, 52, 12, 57");
                
        
        // Output tree list
        System.out.println("\nTreeSet is one of the most important implementations of "
                + "the SortedSet interface in Java that uses a Tree for storage."
                + "\nNotice how the list is sorted in ascending order now.");
        // Iterate through TreeSet
        Iterator<Integer> itr = mytree.iterator();
            while(itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
  
	// Check empty or not
	if (mytree.isEmpty()) {
		System.out.print("Tree Set is empty.");
	} else {
		System.out.println("Tree Set size= " + mytree.size());
	}
 
	// Show first and last items
	System.out.println("\nThe first item in the tree is " + mytree.first()
                            + " and the last item is " + mytree.last());
 

        // Remove last item from tree
        System.out.println("\nRemove the last item from the tree.");
	if (mytree.remove(mytree.last())) { 
		System.out.println("Data is removed from tree set\n");
	} else {
		System.out.println("There is nothing to remove");
	}
	System.out.print("Now the tree set size= " + mytree.size());

        // Show first and last items
	System.out.println("\nThe first item in the tree is " + mytree.first()
                            + " and the last item is " + mytree.last());
 
	// Remove all
        System.out.println("\nRemove all the items from the tree.");
	mytree.clear();
	if (mytree.isEmpty()) {
		System.out.print("\nTree Set has been cleared.\n");
                System.out.print("Now the tree set contains " + mytree.size() + " elements\n");
	} else {
		System.out.println("Clearing failed.  There are still " 
                                    + mytree.size() + " elements in the tree.\n");
	}
   }
    
   
}
