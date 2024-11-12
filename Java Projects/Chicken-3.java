/*
Subclass: Chicken.java
Programmer: Anthony Chipner
Purpose: Demonstrate Abstract classes and methods.
*/
package abstractletseat;
// subclass Chicken extends Food
public class Chicken extends Food {
    // Local method Eat overrides abstract method Eat()
    @Override
    public void Eat(){
        System.out.println("I like fried chicken!");
    }
}
