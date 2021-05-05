/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csfinalproject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author macma
 */
public class CSFinalProject {
    
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
        // TODO code application logic here
        System.out.println("Welcome to the online C-Store! What would you like to purchase: ");
        String fileContents = readFileString("items.txt");
        System.out.println(fileContents);
    }
    
}
