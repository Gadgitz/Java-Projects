/*
Program: MultipleRecordTest.java
Programmer: Anthony Chipner
Pupose: Demonstate writing and reading multiple records to textfile
*/
package multiplerecordtest;

import java.io.*;
import java.util.*;
public class MultipleRecordTest {
    public static void main(String[] args) {
       // Declare File Object file
       File file = new File("MultiText.txt");
       // Declare Scanner object output
       Scanner output = new Scanner(System.in);
       try{
           //Declare PrintWriter object fi
           PrintWriter fi = new PrintWriter(file);
           for(int i = 0; i < 2; i++){
               //Prompt user to enter first name, last name, and age
               // Use format method to write data to the file and create
               // file structure
               System.out.println("Enter First name: ");
               String fName = output.next();
               fi.format("%s", fName);
               System.out.println("Enter Last name: ");
               String lName = output.next();
               fi.format("%s ", lName);
               System.out.print("Enter age: ");
               int age = output.nextInt();
               fi.format("%d%n", age);
           }
           // close file object fi
           fi.close();
       }
       catch(Exception e){
           System.out.printf("%s %n", e);
       }
       // read file data
       
       try{
           //Create Scanner object input to read dtat from the file
           Scanner input = new Scanner(file);
           //iterate through the records until no more data is available
           // this is the end-of-file indicator
           while(input.hasNext()){
               String fName = input.next();
               String lName = input.next();
               //int age = input.nextInt(); // it seems there is an error in your code here sir, i was able to run without it and it will work fine..
               // kind of a weird error.
               //Print each record after it has been read
               System.out.printf("%s %s is years old%n", fName, lName);
           }
           input.close(); // close file connection
       }
       catch(FileNotFoundException e){
           System.out.printf("File MultiText.txt not found", e);
       }
    } // end main
    
} // end class MultipleRecordTest
