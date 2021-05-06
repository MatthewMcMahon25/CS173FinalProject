/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csfinalproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Matt McMahon and Emily Franz
 */
public class CSFinalProject {
    /**
     * read a file's contents given a filename, and return a String with the data
     * @param path
     * @return a String with all the file data
     */
    public static String readFileString(String fileName){
        String result = "";
        try {
            result = Files.readString(Paths.get(fileName));
        }catch(IOException e) {
            System.err.println(e);
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String itemsData = readFileString("items.txt");
        System.out.println(itemsData);
        
        //Split each line into an item w/ contents into an array
        String[] lines = itemsData.split("\n");        
        
        //HashMap<String, HashMap<String, >> places = new HashMap<String, Hashmap<>>();
        
        //Split each line into individual parts based on ","
        for(String line: lines) {
            System.out.println("Here's a line: " + line);
            
            String[] values = line.split(",");
            
            System.out.println(Arrays.toString(values));
            
            String foodName = values[0];
            int calories = Integer.parseInt(values[1]);
            int protein = Integer.parseInt(values[2]);
            int fat = Integer.parseInt(values[3]);
            int carbs = Integer.parseInt(values[4]);
            double cost = Double.parseDouble(values[5]);
                  
            Food f = new Food(foodName, calories, protein, fat, carbs, cost);
            
        }
        //for loop
        //Based upon position in array, set that to a food array, possibly hashmap
        //where you have [foodName, calories, protein, fats, carbs, cost]
        
        
        
        System.out.println("Welcome to the online C-Store! What would you like to purchase: ");
        
        
    }  
}
