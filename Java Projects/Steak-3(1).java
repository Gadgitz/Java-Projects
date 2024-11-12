/*
Subclass: Steak.java
Programmer: Anthony Chipner
Purpose: Demonstrate Abstract classes and methods.
*/
package abstractletseat;
// sublcass Steak Extends food.
public class Steak extends Food {
    
    // Local method Eat() overrides abstract method Eat() in Food.
    @Override
    public void Eat(){
        System.out.println("I like Steak!");
    }
    
}
