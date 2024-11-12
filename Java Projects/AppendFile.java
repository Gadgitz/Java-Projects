/*
Program: appendFile.java
Programmer: Anthony Chipner
Purpose: Demonstrate append (adding) dat to existing text file
*/

package appendfile;
import java.io.*;
import java.util.*;
public class AppendFile {
    public static void main(String[] args) throws IOException {
        
       //Declare Scanner object input
       Scanner input = new Scanner(System.in);
       // Declare File object file
       File file = new File("Append.txt");
       // declare variable
       String eData;
       //Prompt user to enter data that will be stores in variable eData
        System.out.print("Enter Data: ");
        eData = input.nextLine();
        // Declare FileWriter object output
        FileWriter output = new FileWriter(file, true);
        //write data to file
        output.write("\n" + eData);
        //close output to file Append
        output.close();
    }//End Main()
}// End Class AppendFile
