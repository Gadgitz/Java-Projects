/*
Program: Dog.java
Programmer: Anthony Chipner
Purpose: demonstrating interface and implentation.
 */
package interfaceapp;

public class Dog implements Eat{ // implemented interface class Eat to dog class. 

    @Override
    public void eating() { // overrided abstract class eating. 
        System.out.println("The Dog is eating"); // gave it a method.. AKA added something for it to do. 
    }
    
}
