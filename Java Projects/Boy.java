/*
Program: Boy.java
Programmer: Anthony Chipner
Purpose: demonstrating interface and implentation.
 */
package interfaceapp;
public class Boy implements Eat, Drink{ // implemented interface class Eat and Drink to boy class. 

    @Override
    public void eating() { // overrided abstract class drinking.
        System.out.println("The Boy is Eating."); // gave it a method.. AKA added something for it to do. 
    }

    @Override
    public void drinking() { // overrided abstract class drinking.
        System.out.println("The Boy is Drinking."); // gave it a method.. AKA added something for it to do. 
    }
    
}
