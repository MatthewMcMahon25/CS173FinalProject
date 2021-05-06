/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csfinalproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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
                
        HashMap<String, ArrayList<Food>> foodMap = new HashMap<>();
        
        //Split each line into individual parts based on ","
        for(String line: lines) {
            System.out.println("Here's a line: " + line);
            
            String[] values = line.split(",");
            
            System.out.println(Arrays.toString(values));
            
            String foodName = values[0];
            double calories = Double.parseDouble(values[1]);
            double protein = Double.parseDouble(values[2]);
            double fat = Double.parseDouble(values[3]);
            double carbs = Double.parseDouble(values[4]);
            double cost = Double.parseDouble(values[5]);
            
            Food f = new Food(calories, protein, fat, carbs, cost);
            ArrayList<Food> contents = new ArrayList<Food>();
            
            contents.add(f);        
            foodMap.put(foodName, contents);
           
        }

        System.out.println("Welcome to the online C-Store! Here are your options: ");
        
        boolean hungry = true;
        double totalCalories = 0;
        double totalProtein = 0;
        double totalFat = 0;
        double totalCarbs = 0;
        // do-while(hungry = true)
        
        // Print out:
        // Gatorade Bar - $2.67 
        // Calories: 200g, Protein: 30g, Fat: 20g, Carbs: 50g
        // etc.
        
        //"Please select an item:" User input
        
        //The current cost of your meal is $-.--
        //Your current meal stats are: Calories: -g, Protein: -g, etc.
        
        //do{
        //"Are you still hungry, yes or no?" User input
        // if userInput != "yes" or "no" --> 
        //}while(hungryQuestion != yes // hungryQuestion !==no)
        // if (userInput = "no"){
        // hungry = false;
        //}
        
        //Print out final stats
        //"Thank you for using the online c-store
    }  
}
