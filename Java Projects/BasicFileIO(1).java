/*
Program: BasicFileIO.java
Programmer: Anthony chipner
Purpose: Demonstrate Text File IO
*/
package basicfileio;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicFileIO {
    public static void main(String[] args) {
        // Declare File object file
        File file = new File("test.txt");
        try{
            PrintWriter output = new PrintWriter(file);
            output.println("Hello Anthony");
            output.println("This is your file now you win!");
            output.close();
        }
        catch(IOException e){
        System.out.printf("ERROR %s%n", e);
        }
        
    }
    
}
