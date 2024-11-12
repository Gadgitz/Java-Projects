/*
Program: InterfaceApp.java
Programmer: Anthony chipner
Purpose: to demonstrate and use interface in java.
*/
package interfaceapp; // package name
public class InterfaceApp { // begin class 
    public static void main(String[] args) { // begin main method
        Dog dog = new Dog(); // created object
        Cat cat = new Cat(); // created object 
        Boy boy = new Boy(); // created object
        
        dog.eating(); // called abstract method
        cat.drinking(); // called abstract method
        boy.drinking(); // called abstract method
        boy.eating(); // called abstract method
        
    }// end main method
    
}
