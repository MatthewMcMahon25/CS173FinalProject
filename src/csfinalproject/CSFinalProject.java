/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csfinalproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Matt McMahon and Emily Franz
 */
public class CSFinalProject {
    /**
     * Returns a String with the text from a selected file
     * @param path
     * @return String result
     */
    public static String readFileString(String path){
        String result = "";
        try {
            result = Files.readString(Paths.get(path));
        }catch(IOException e) {
            System.err.println(e);
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Split each line, based on ""
        
        
        //Split each line into individual parts based on ","
        
        food food1 = new food("Gatorade Bar", 330, 20, 10, 43, 4.30);
        
        System.out.println("Welcome to the online C-Store! What would you like to purchase: ");
        String fileContents = readFileString("items.txt");
        System.out.println(fileContents);
        
    }  
}
