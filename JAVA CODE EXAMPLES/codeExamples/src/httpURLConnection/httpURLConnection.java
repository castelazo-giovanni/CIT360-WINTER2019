/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class httpURLConnection {
    
    
    	public static void main(String[] args) throws Exception {
            
            System.out.println("Example with pre-inputted website.");
            System.out.println("This will read from the following site 'https://castelazo-giovanni.github.io/index.html'");
            
            
            // HTTP connection objects
            URL myURL = new URL("https://castelazo-giovanni.github.io/index.html");
            HttpURLConnection urlConnection = (HttpURLConnection) myURL.openConnection();
 
                // Print the HTML code of the page
                try ( // Put into BufferedReader
                        BufferedReader webStream = new BufferedReader(
                                new InputStreamReader(urlConnection.getInputStream()))) {
                    // Print the HTML code of the page
                    String linesOfCode;
                    while ((linesOfCode = webStream.readLine()) != null) {
                        System.out.println(linesOfCode);
                    }
                    // Close buffer
                    webStream.close();                    
                }  
		
            System.out.println("\nExample with you choosing your site.");
            
            // Reads what user inputs
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a website to connect to.  URL = https://(start your address with WWW)");
            String userWebsite = userInput.next();
               
            // HTTP connection objects
            URL yourURL = new URL("https://" + userWebsite);
            HttpURLConnection yourURLConnection = (HttpURLConnection) yourURL.openConnection();
 
                // Print the HTML code of the page
                try ( // Put into BufferedReader
                        BufferedReader yourWebStream = new BufferedReader(
                                new InputStreamReader(yourURLConnection.getInputStream()))) {
                    // Print the HTML code of the page
                    String newLinesOfCode;
                    while ((newLinesOfCode = yourWebStream.readLine()) != null) {
                        System.out.println(newLinesOfCode);
                    }
                    // Close buffer
                    yourWebStream.close();                    
                }
            
                
            // Show header information for site user chooses
            System.out.println("\n-------Here is some header information for your site-------");   
            
            // Retrieve all the HEADER information
            Map<String, List<String>> map = yourURLConnection.getHeaderFields();
 
            System.out.println("This is All Response Header for: " + yourURL.toString() + "\n");
            
                // Ouputs all HEADER fields
                map.entrySet().forEach((entry) -> {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                });
		
            // Output HEADER content length
            List<String> contentLength = map.get("Content-Length");
            if (contentLength == null) {
		System.out.println("'Content-Length' NOT FOUND!");
            } else {
                contentLength.forEach((header) -> {
                    System.out.println("Content-Lengtht: " + header);
                });
            }
                

            // Checks if site is up or down
            String siteStatus = showSiteStatus("https://" + userWebsite);
 
            System.out.println("\n" + userWebsite + "\t\tStatus:" + siteStatus);
        }    
        
        
        public static String showSiteStatus(String testURL) throws IOException {
 
        String siteResult = "";
        try {
            // Create a new HttpURL object
            URL testSiteURL = new URL(testURL);
            HttpURLConnection newConnection = (HttpURLConnection) testSiteURL.openConnection();
            
            // Method to GET information from the URL
            newConnection.setRequestMethod("GET");
            
            // Connect to the URL
            newConnection.connect();
 
            // Check the response code for connection to URL
            int siteRespondCode = newConnection.getResponseCode();
            
            // HTTP response code of 200 means site is up
            if (siteRespondCode == 200) {
                siteResult = "UP";
            }
            
            // Terminate the HTTP URL connection
            newConnection.disconnect();
        } catch (IOException e) {
            siteResult = "DOWN";
        }
        return siteResult;
    }
    
}
