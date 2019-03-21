/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_spoke;

import java.util.*;
/**
 *
 * @author Giovanni
 */
public class Hibernate_Spoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpokeDAO t = SpokeDAO.getInstance();

        List<Registration> c = t.getRegistrations();
        for (Registration i : c) {
            System.out.println(i);
        }

        System.out.println(t.getRegistration(1));
    }
    
}
