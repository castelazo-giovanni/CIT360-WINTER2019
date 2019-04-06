/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJSON;

//json.simple-1.1.1.jar library must be included with project to make this program work

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Giovanni
 * This program will read the myFamily.json file that was created when after running writeJSON.java
 * It is located two levels up and stored in the codeExamples folder
 */
public class readJSON {
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("myFamily.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray familyList = (JSONArray) obj;
            System.out.println(familyList);
             
            //Iterate over family array
            familyList.forEach( fam -> parseFamilyObject( (JSONObject) fam ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseFamilyObject(JSONObject family)
    {
        //Get family member object within list
        JSONObject familyObject = (JSONObject) family.get("family");
         
        //Get family member's first name
        String firstName = (String) familyObject.get("firstName");   

         
        //Get family member's last name
        String lastName = (String) familyObject.get("lastName"); 
        
         
        //Get family member's relation
        String relation = (String) familyObject.get("relation");   

        
        // Output family member information
        System.out.println(firstName + " " + lastName + "\n" + relation + "\n");
    }
    
}
