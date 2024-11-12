/*
* Program: EmployeeClass.java
* Programmer: Anthony Chipner
* Purpose: constructor class  to store set and get methods and their variables.
*/
package employeeclass_excercise3.pkg13;
public class EmployeeTest {
    public static void main(String[] args){
        EmployeeClass employee1 = new EmployeeClass("Bob", "Taylor", 10000.00); // created object to obtain firstname,lastname and monthly salary.
        EmployeeClass employee2 = new EmployeeClass("Mary", "Lamb", 15000.00); // created object to obtain firstname, lastname and monthly salary.
        
        System.out.printf(" %s %s's yearly salary is: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);/*Prints out First and Last name
        and calulates and prints yearly salary for emplyee1 object*/
        System.out.printf(" %s %s's yearly salary is: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);/*Prints out First and Last name
        and calulates and prints yearly salary for employee2 object*/
    }
    
}
