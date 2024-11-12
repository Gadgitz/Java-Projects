/* Program: chapter 7 Array & ArrayList sorting, searching, removing and printing of lists. 
* The programmer: Anthony Chipner
* Date: 10/01/2023
* Purpose: testing out different sorts and functions of a class ArrayLists
*/
package listofstrings;

import java.util. *; // imports all of java's API Library. 

public class ListOfStrings { // beginning of ListOfStrings class.
    public static void main(String[] args) { // beginning of main method. 
        
        ArrayList<String> list = new ArrayList<String>(); // created new instance of list class.
        String apple = "apples"; // created and initialized new variable to add new item.
        String orange = "oranges"; // created and initialized new variable to add new item.
        String peach = "peaches"; // created and initialized new variable to add new item.
        
        list.add(orange); // added new item to list.
        list.add(apple); // added new item to list.
        list.add(peach); // added new item to list.
        Collections.sort(list); // sorted the list in ascending order. 
        int searchValue = Collections.binarySearch(list, peach); // binary search which should return an index of 2.
        
        for(int i = 0; i < list.size(); i ++){ // for loop to print list after first sort.
            System.out.printf("Index %d: %s%n", i,list.get(i)); // print method to display list and index of each item in the list.
        } // end for loop
        
        list.add("Watermelon"); // added new value to list.
        Collections.sort(list); // resorted list after adding new value.
        System.out.println("\n New List after Adding a new string:"); // just a marker to show the new list is below.
        for(int j = 0; j < list.size(); j++){ // for loop to print the new list after changes. 
            System.out.printf(" Index %d: %s%n", j,list.get(j)); // print method to display list and index of each item in the list after adding new item.
        } // end for loop
        list.remove(apple); // remoed object apple from list. 
        Collections.sort(list); // resorted list. 
        
        System.out.println("\nNew List after Removal of 'apple' and resorted in ascending: ");
        for(int k = 0; k < list.size(); k++){ // begin for loop for reprint after changes. 
            System.out.printf(" Index %d: %s%n", k,list.get(k)); // print method to display list and index of each item in the list after removing an item and resorting.
            
        }// end for loop
    } // end of main method 
    
} // end of ListOfStrings class. 
