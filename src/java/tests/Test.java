/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cocog
 */
public class Test 
{
     public static void main(String[] args) throws FileNotFoundException, IOException 
     {
         String path = "C:/Users/cocog/Documents/CPRG-352/Week4Lab/web/WEB-INF/note.txt";
        // to read files
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();
        System.out.println(title + contents);

     }
    
}
