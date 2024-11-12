/*
* Program: TempConversion
* Programmer: Anthony Chipner
* Purpose: Untilize methods controlled by the user to convert to either celcius or Fahrenheit.
*/
package tempconversion;
import java.util.*;
public class TempConversion {
    double celsius = 0;
    double fahrenheit = 0;
    public double Celsius(double fahrenheit){
    return celsius = 5.0 / 9.0 * (fahrenheit - 32);
    }
    public double Fahrenheit(double celsius){
        return fahrenheit = 9.0 / 5.0 * celsius + 32;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter 1 for a Celcius conversion or 2 for Fahrenheit Conversion. ");
       int choice = input.nextInt();
       
       if(choice == 1){
           System.out.println("Please enter a Fahrenheit amount for conversion. ");
           double nCelsius = input.nextDouble();
           TempConversion convertCelsius = new TempConversion();
           double newCelsius = convertCelsius.Celsius(nCelsius);
           System.out.printf("Fahrenheit to Celsius conversion is: %.2f degrees Celsius%n", newCelsius);
       } else if (choice == 2){
           System.out.println(" Please enter a Celcius amount for conversion. ");
           double nFahrenheit = input.nextDouble();
           TempConversion convertFehrenheit = new TempConversion();
           double newFahrenheit = convertFehrenheit.Fahrenheit(nFahrenheit);
           System.out.printf("Celsius to Fahrenheit conversion is: %.2f degrees Fahrenheit%n", newFahrenheit);
       }
    }
    
}
