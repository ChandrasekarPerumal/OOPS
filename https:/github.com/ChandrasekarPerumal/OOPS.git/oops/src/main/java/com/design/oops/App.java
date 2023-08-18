package com.design.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
                String baseUrl = "https://nominatim.openstreetmap.org/search";
                String format = "json";
                String pincode = "560043";

                try {
                    String urlString = String.format("%s?q=%s&format=%s", baseUrl, pincode, format);
                    URL url = new URL(urlString);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    JSONArray jsonResponse = new JSONArray(response.toString());

                    System.out.println("jsonResponse  --" +jsonResponse);
                    
                    if (jsonResponse.length() > 0) {
                        JSONObject location = jsonResponse.getJSONObject(0);
                        double latitude = location.getDouble("lat");
                        double longitude = location.getDouble("lon");
                        System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
                    } else {
                        System.out.println("No results found.");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
         
        
    }
}
