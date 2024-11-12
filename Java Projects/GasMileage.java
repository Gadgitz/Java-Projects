/*
* Program: GasMileage.java
* Programmer: Anthony Chipner
* Purpose: Application to calculate gas mileage and total trips average.
*/
package gasmileage;
import java.util.*; // imports all classes in the java library.
public class GasMileage { // start of class GasMileage.
    public static void main(String[] args) { // main method
        Scanner input = new Scanner(System.in); // new scanner object to obtain user input.
        int trip= 0; // variable for trip counter.
        int miles = 0; // variable for miles driven.
        int fuel = 0; // variable for fuel consumed.
        int total = 0; // variable for total MPG.
        int average = 0; // variable to save the average MPG for all.
        
        System.out.println("Please enter Trip Mileage(Enter -1 to exit"); // prompts the user for trip mileage.
            miles = input.nextInt(); // stores user input in miles variable.
             
        while(miles != -1){ // controlled loop that will continue until the user enters -1 to exit the loop.
            System.out.println("Please enter fuel consumed in gallons."); // prompts the user for trip mileage.
            fuel = input.nextInt(); // stores user input in fuel variable.
            
            trip++; // trip counter.
            int fuelMileage = miles/fuel; // calculation to find MPG.
            total += fuelMileage; // adding all trip MPG together.
            average = total/trip; // utilizing total and trip numbers to calculate average MPG.
            
             
            System.out.printf(" Fuel mileage: %d MPG%n ",fuelMileage); // prompts the user for fuel usage.
            
            System.out.println("Please enter Trip Mileage (Enter -1 to exit)"); // prompts the user for trip mileage.
                miles = input.nextInt(); // stores miles in variable miles.
        } // End loop.
        System.out.printf(" Average MPG: %d%n ", average); // after exiting loop prints out the average MPG from all trips.
    }// End Main Method.

} // End Class.
