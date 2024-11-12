/*
* Program: EmployeeClass.java
* Programmer: Anthony Chipner
* Purpose: constructor class  to store set and get methods and their variables.
*/
package employeeclass_excercise3.pkg13;
public class EmployeeClass { // start of the constructor class
    private String firstName; // instance variable to store firstName data.
    private String lastName; //instance variable to store lastName data.
    private Double monthlySalary; //instance variable to store monthlySalary data.
    
    //EmployeeClass constructor that recieves three parameters and initializes them.
    public EmployeeClass(String firstName, String lastName, Double monthlySalary){
        this.firstName = firstName; // assigns the variable to firstName
        this.lastName = lastName; // assigns the variable to lastName
        this.monthlySalary = monthlySalary;// assigns the variable to monthlySalary
    }// end constructor
    public void setMonthlySalary(Double monthlySalary){ // method to set the monthly Salary
        if(monthlySalary > 0.0){ // checks to make sure the value is greater than 0.0
            this.monthlySalary = monthlySalary;// assigns the variable to monthlySalary
        } //end if statement
    }// end method
    
    public double getMonthlySalary(){ // method to get the monthlySalary
        return monthlySalary; // return the data from variable monthlySalary
    }
    
    // method sets firstName
    public void setFirstName(String firstName){ // method start to set firstName
        this.firstName = firstName;// sets the variable to firstName
    }
    // method returns firstName
    public String getFirstName(){
        return firstName;// return the data from variable firstName
    }
    
    // method sets lastName
    public void setLastName(String lastName){
        this.lastName = lastName;// sets the variable to lastName
    }
    // method returns monthlySalary
    public String getLastName(){
        return lastName;// return the data from variable lastName
    }
    
}// end class
