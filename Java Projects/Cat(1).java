/*
Program: Dog.java
Programmer: Anthony Chipner
Purpose: demonstrating interface and implentation.
 */
package interfaceapp;
public class Cat implements Drink { // implemented interface class Drink to cat class. 

    @Override
    public void drinking() { // overrided abstract class drinking. 
        System.out.println("The Cat is Drinking!"); // gave it a method.. AKA added something for it to do. 
    }
    
}
