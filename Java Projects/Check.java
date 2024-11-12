/*
* Driver Class: StudentGrades.java
* Programmer: Anthony Chipner
* Purpose: checks to see if the grades are from 0 to 100 and returns them along with calculating the average and returning it. 
*/
package studentgrades;
public class Check { // begin class
    private int grade1; // private variable
    private int grade2; // private variable
    private int average; // private variable
    private String firstName; // private variable
    private String lastName; // private variable
    
    public String Name(String firstName, String lastName){ // method begin
        this.firstName = firstName; // invokes firstName as an object.
        this.lastName = lastName; // invokes lastName
        return firstName + lastName; // returns first and last name.
    } // end method
    
    public int GradeCheck(int grade1){ // checks grade1 for validation.
        if (grade1 >= 0 && grade1 <= 100){ // if statement begins check
            this.grade1 = grade1; // creates object if true.
        } else // else statement begins.
            System.out.println("This is not a valid Grade! Grade must be between 1 - 100"); // prints out this message if the number is not in range. 
        return grade1; // returns number if good. 
    } // end method
    
    public int GradeCheck2(int grade2){ // checks grade2 for validation.
        if (grade2 >= 0 && grade2 <= 100){ // if statement begins check
            this.grade2 = grade2; // creates object if true.
        } else
            System.out.println("This is not a valid Grade! Grade must be between 1 - 100");
        
        return grade2; // else statement begins.
    } // end method
    
    public int calculateA(int grade1, int grade2){ // begin method to calculate the average
        int average = (grade1 + grade2) / 2; // calculation for the average
        return this.average = average; // returns the average. 
    } // end method
    
} // end class 
