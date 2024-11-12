// 3.13 Java Project assignment
// Anthony Chipner
// 08/29/18

public class Employee {

   private String firstName; //first name
   private String lastName; //last name
   private double monthlySalary; //monthly salary
   private double totalSalary; // total salary
   private double yearlySalary; // total salary
   private int monthsinYear = 12; //months in the year
   private double raise = 0.10; // raise.
   private double yearlyRaise; // yearly raise

   public Employee(String firstName, String lastName, Double monthlySalary) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.monthlySalary = monthlySalary;

      if (monthlySalary > 0.0) {
         this.monthlySalary = monthlySalary;
      }

      if (totalSalary > 0.0) {
         this.totalSalary = totalSalary;
      }

      if (yearlySalary > 0.0) {
         this.yearlySalary = yearlySalary;
      }
      yearlySalary = monthlySalary * monthsinYear;

      totalSalary = yearlySalary * raise;

      yearlyRaise = totalSalary + yearlySalary;
      }
       public void setfirstName(String firstName){
         this.firstName = firstName;
       }
       public String getFirstName(){
         return firstName;
       }
       public void setlastName(String lastName) {
         this.lastName = lastName;
       }
       public String getlastName(){
         return lastName;
       }
       public void setMonthlySalary(Double monthlySalary){
         this.monthlySalary = monthlySalary;
       }
       public Double getmonthlySalary(){
         return monthlySalary;
       }
   public void setTotalSalary(double totalSalary) {
      this.totalSalary = totalSalary;
   }
   public Double gettotalSalary(){
      return totalSalary;
   }

   public void setYearlySalary(double yearlySalary) {
      this.yearlySalary = yearlySalary;
   }
   public Double getyearlySalary(){
      return yearlySalary;
   }
   public void setyearlyRaise(double yearlyRaise){
      this.yearlyRaise = yearlyRaise;
   }
   public Double getyearlyRaise(){
      return yearlyRaise;
   }

}

