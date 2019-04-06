/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJSON;

import java.io.FileWriter;
import java.io.IOException; 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Giovanni
 * This will write a simple JSON file named myFamily.json
 * When the file it written, it is written two levels up and stored in the codeExamples folder
 * 
 */
public class writeJSON {

    @SuppressWarnings("unchecked")
    
    public static void main( String[] args )
    {
        //Family Member 1
        JSONObject familyMember1 = new JSONObject();
        familyMember1.put("firstName", "Giovanni");
        familyMember1.put("lastName", "Castelazo");
        familyMember1.put("relation", "self");
         
        JSONObject familyObject1 = new JSONObject();
        familyObject1.put("family", familyMember1);
         
        //Family Member 2
        JSONObject familyMember2 = new JSONObject();
        familyMember2.put("firstName", "Heather");
        familyMember2.put("lastName", "Castelazo");
        familyMember2.put("relation", "wife");
         
        JSONObject familyObject2 = new JSONObject();
        familyObject2.put("family", familyMember2);
         
        //Family Member 3
        JSONObject familyMember3 = new JSONObject();
        familyMember3.put("firstName", "Vanessa");
        familyMember3.put("lastName", "Mora");
        familyMember3.put("relation", "sister");
         
        JSONObject familyObject3 = new JSONObject();
        familyObject3.put("family", familyMember3);
        
        //Family Member 4
        JSONObject familyMember4 = new JSONObject();
        familyMember4.put("firstName", "Xavier");
        familyMember4.put("lastName", "Castelazo");
        familyMember4.put("relation", "brother");
         
        JSONObject familyObject4 = new JSONObject();
        familyObject4.put("family", familyMember4);
        
        //Add family to list
        JSONArray familyList = new JSONArray();
        familyList.add(familyObject1);
        familyList.add(familyObject2);
        familyList.add(familyObject3);
        familyList.add(familyObject4);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("myFamily.json")) {
 
            file.write(familyList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
