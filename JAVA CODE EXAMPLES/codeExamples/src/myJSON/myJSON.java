package myJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giovanni
 */
public class myJSON {
    


 
            
           
 
            
 
            
 

 
        
        public static void main(String[] args) throws Exception {
        // parsing file "JSONExample.json"
        Object object = new JSONParser().parse(new FileReader("C:\\Users\\Giovanni\\Desktop\\BYUI\\CIT 360\\CIT 360\\CIT360-WINTER2019\\JAVA CODE EXAMPLES\\codeExamples\\src\\myJSON\\superheroes.json"));

        // typecasting obj to JSONObject
        JSONObject jsonObject = (JSONObject) object;

        // getting firstName and lastName
        String name = (String) jsonObject.get("name");
        System.out.println(name);

        // getting age
        long age = (Long) jsonObject.get("age");
        System.out.println(age);
        
        // Gets secret identity
        
        String secIdent = (String) jsonObject.get("secretIdentity");
            System.out.println(secIdent);

        // Gets super powers

        
        
       Map powers = ((Map) jsonObject.get("powers"));
        System.out.println("Super Powers Include: ");

        // iterating address Map
        Iterator<Map.Entry> itr1;
        itr1 = powers.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println("\t" + pair.getKey());
        }

    }

}
