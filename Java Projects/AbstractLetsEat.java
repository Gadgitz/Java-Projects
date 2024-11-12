/*
Program: AbstractLetsEat.java
Programmer: Anthony Chipner
Purpose: Demonstrate Abstract classes and methods.
*/
package abstractletseat;

public class AbstractLetsEat {

    public static void main(String[] args) {
        // instantiate classes and calls non abstract methods
        Steak steak = new Steak();
        steak.Eat();
        Chicken chicken = new Chicken();
        chicken.Eat();
        Wine wine = new Wine();
        wine.DrinkIt();
    }
    
}
