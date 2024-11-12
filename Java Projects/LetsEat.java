/*
* Superclass: LetsEat.java
* Programmer: Anthony Chipner
* Purpose: Demonstrate OOP inheritance
*/
package letseat;
public class LetsEat {
    public static void main(String[] args) {
        // instantiate object food of Food class
        Food food = new Food();
        Steak steak = new Steak();
        Chicken chicken = new Chicken();
        Drink drink = new Drink();
        Beer beer = new Beer();
        Wine wine = new Wine();
        
        // call method Eat () from object food
        food.Eat();
        steak.Eat();
        chicken.Eat();
        drink.Eat();
        beer.Drinkit();
        wine.DrinkIt();
    }
    
}
