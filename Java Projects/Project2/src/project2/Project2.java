/*
* Program: Project2.java
* Programmer: Anthony Chipner
* Purpose: Application to use a vector to store 10 strings and a recursive/method 
    "isPalindrome" to determine whether a string is a palindrome or not.
*/
package project2;
import java.util.*; // import java.util package
public class Project2 {
    //main method begins
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// created new scanner object to take user input.
        Vector<String> vector = new Vector<>();// initiating new vector object to hold word lists
        for(int z = 0; z < 10; z++){
        System.out.println("Please enter a word."); // requesting for user to enter words that need to be tested and stored.
        String word = input.next(); // storing strings in word variable
        vector.add(word);// adding each word to the vector.
    } // closing of for loop
        int vectorSize = vector.size(); // created counter variable for base case based off of the size of the vector.
        Enumeration<String> enumObject = vector.elements(); // set all the elements in the vector to a string utilizing enumobject.
        isPalindrome(enumObject, vectorSize); // called the recursion method passing in enumObject and vectorSize.
        
    }// end of main method
    // recursion method begins.
    private static void isPalindrome(Enumeration<String> enumObject, int vectorSize){ 
        //base case
        if (vectorSize <= 0){ // if statement to check the vector size.
           return; // will return to the main method if the vector size is <= to 0;
        }
        while(enumObject.hasMoreElements()){ // while loop to start the conversion of elements to strings and then to confirm if it is a palindrome or not.
           String word = enumObject.nextElement(); // set element ot a string and stored in the word variable.
        
        String reverse = ""; // declared an empty string to store the newly reversed word.
        boolean answer = false; // declared a boolean to answer is true or false as whether or not it is a palindrome.
        for (int i = word.length() - 1; i >= 0; i--){ // for loop to interate thru each character of the string and reorder it.
        reverse = reverse + word.charAt(i); // add a character each pass of the loop to the new variable reverse.
        } // end of for loop
        if(word.equals(reverse)){ // checking to see if the word is the same as the word we got when we reversed it.
            answer = true; // if thru then it will print out below.
            System.out.println("The word: " + word + " is a Palindrome.");// print statement to show if word is palindrome.
        } // end if statement 
        else{ // if the word is not that same then this will incur.
        System.out.println("The word: " + word + " is not a Palindrome.");  // printing out that the word is not a palindrome.
    } // end else statement
        } // end while loop
        
        isPalindrome(enumObject,vectorSize - 1);// recursion call for the method with adding a -1 to the vector size each time its called.
    } // end recursion method
    
    
}// end of class
