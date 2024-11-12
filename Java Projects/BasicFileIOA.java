/*
Program: BasicFileIO.java
Programmer: Anthony chipner
Purpose: Demonstrate Text File IO
*/
package basicfileioa;
import java.util.*;
import java.io.*;
public class BasicFileIOA {
    public static void main(String[] args) {
        String filePath = 
                ("/Volumes/Spare/NetBeansProjects/BasicFileIO/test.txt");
        //declare File object file.
        File file = new File(filePath);
        try{
            //Declare Scanner object input
            Scanner input = new Scanner(file);
            String line = input.nextLine();
            String line2 = input.nextLine ();
            
            System.out.printf("The message says: %s%n%s", line, line2);
        }
        catch(IOException e){
            System.out.printf("Error: %s %n", e);
            
        }
    }
    
}
