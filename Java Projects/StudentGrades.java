/*
* Driver Class: StudentGrades.java
* Programmer: Anthony Chipner
* Purpose: created a driver class to manipulate user data and return it to class to print back to user utilizing the toString method.
*/
package studentgrades; // package name 
import java.util.*; // import all Utility java API's from library.
public class StudentGrades { // begin class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // created new scanner object to instantiate scanner.
        Check checkgrade1 = new Check(); // new grade 1 object
        Check checkgrade2 = new Check(); // new grade 2 object
        Check average = new Check(); // new average object
        Check student = new Check(); // new student object
        
        System.out.println("Please enter a Student's First name"); // print to user to request first name.
        String firstName = input.nextLine(); // stores answer in firstName
        System.out.println("Please enter the Student's last name"); // prints to user to request last name.
        String lastName = input.nextLine(); // stores answer in lastName
        System.out.println("Please enter First Grade"); // prints to user to request first grade.
        int grade1 = input.nextInt(); // stores response in grade1.
        Object newGrade1 = checkgrade1.GradeCheck(grade1); // creates grade object to store and check grade in newGrade1 
        System.out.println("Please enter Second Grade"); // request second grade from user
        int grade2 = input.nextInt(); // stores answer in grade2
        Object newGrade2 = checkgrade2.GradeCheck2(grade2); // creates grade object to store and check grade in newGrade2 
        
        Object newAverage = average.calculateA(grade1, grade2); // // creates grade object to store and average both grades and save them in newAverage. 
        
        String name = student.Name(firstName, lastName); // stores first and last name in name and instantiates the first and last name.
        
        System.out.print("Student's Name: " + name.toString() + " \nStudents first grade: " + newGrade1.toString() + 
                " \nStudents Second Grade: " + newGrade2.toString() +" \nStudents Average: " + newAverage.toString()+"\n"); // print statement to print utilizing the toString method to print the first name, last name, grade1, grade2 and average.
    }
    
}
