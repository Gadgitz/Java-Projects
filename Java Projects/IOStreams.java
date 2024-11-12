/*
Program: IOStream.java
Programmer: Anthony Chipner
Purpose: To showcase files input/output Streams for Homework Chapter 15 - FIles Input/Output Streams
*/

package iostreams;
import java.io.*;
import java.util.*;
public class IOStreams {
    public static void main(String[] args)throws IOException {
        // create Scanner object
        Scanner input = new Scanner(System.in);
        // declare File object file
        File file = new File("IOStream.txt");
        
        // declare variable
        String myData;
        //Prompt user to enter data
        System.out.println("Please enter new data. ");
        myData = input.nextLine();
        
        // declares file writer object.
        FileWriter output  = new FileWriter(file, true);
        
        // writes data to the file
        output.write("%n" + myData);
       
        // close output to append the file
        output.close();
        
    }
    
}
