/*
Super-Subclass: Wine.java
Programmer: Anthony Chipner
Purpose: Demonstrate Abstract classes and methods.
*/
package abstractletseat;
// sub-subclass Wine extends Drinks
public class Wine extends Drinks {
    
    @Override
    public void DrinkIt(){
        // local method DrinkIt() overrides abstract method Drinkit()
        System.out.println("I like Wine with my Food!");
    }
}
