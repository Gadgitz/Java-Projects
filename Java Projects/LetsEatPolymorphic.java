/*
Program: LetsEatPolymorphic.java
Programmer: Anthony chipner
Purpose: Demonstrate PolyMorphic Arrays.
*/
package letseatpolymorphic;
public class LetsEatPolymorphic {
    public static void main(String[] args) {
       /* // instantiates object food
        Food food = new Food();
        food.Eat(); // Calls eat method from food
         // instantiates object Steak
        Steak steak = new Steak();
        steak.Eat(); // // call . eat method through inheritance
         // instantiates object Chicken
        Chicken chicken = new Chicken();
        chicken.Eat(); // call. east() method i nchicken override eat() method in Food.
       */
       
       Food allFood[] = new Food[3];
       
       // populate allFood
       allFood[0] = new Food();
       allFood[1] = new Steak();
       allFood[2] = new Chicken();
       
       // intereate through all food polyphorphic Array.
       
       for(int i = 0; i < allFood.length; i++){
           allFood[i].Eat();
       }
    }
    
}
