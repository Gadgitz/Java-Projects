/* Program: chapter 7 Array & ArrayList random numbers, sum and average. 
* The programmer: Anthony Chipner
* Date: 10/01/2023
* Purpose: Adds 10 random numbers to a list and then sums those numbers and averages then prints them out. 
*/
package randomnumber_arraylist_addition;
import java.util.*; // import statement for all of java API library.
public class Randomnumber_arraylist_addition { // class begins
    
    public static void main(String[] args) { // mains beginning 
        int sum = 0; // initialize sum variable for later use.
        int average; // initialize average variable for later use.
        Random randomNumber = new Random(); // creating a new instance of random class
        int upperBound = 100; // setting the upper bound of the random numbers so they are easier to work with.
        
        ArrayList<Integer> num = new ArrayList<Integer>(); // created an array list to hold the random numbers. 
        for(int i = 0; i < 10; i ++){ // created for loop to generate and add the random number to the list. 
            int newRandom = randomNumber.nextInt(upperBound);
            
            num.add(newRandom); // added new random number to list.
            
        } // end of for loop
        
        for (int j = 0; j < num.size(); j++){ // for loop to add all numbers in the list and sum them up. 
            sum += num.get(j); // adds the random numbers in the list to sum.
        } // end of for loop
        average = sum / num.size(); // equation to get the average of all random numbers and store them in the "average variable.
        
        for(int k = 0; k < num.size(); k++){ // for loop to print out each element in the array list known as "num"
            System.out.printf("Random number %d: %d%n", k, num.get(k)); // prints each number in the array with the index location of each random number.
        } // end for loop
        System.out.printf("Sum: %d Average: %d", sum, average ); // prints the sum and average for the list after it has completed adding the random numbers. 

    } // mains end
    
} //class ends
