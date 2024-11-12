/**

 * Program to

 *

 * @author Anthony Chipner

 * @version January 26, 2022

 */
package lab03;


public class Date {
/**
* main -
* 
* @param       args command line arguments
* @return      month,day, year
*/
   private int month;
   private int day;
   private int year;
   
   public int getMonth(){
       return month;
   }
   
   public void setMonth(int month){
       this.month = month;
   }
   
   public int getDay(){
       return day;
   }
   public void setDay(int day){
       this.day = day;
   }
   
   public int getYear(){
       return year;
   }
   public void setYear(int year){
       this.year = year;
   }
   public void newYear(){
       year+=1;
   }
   public void display(){
       System.out.printf("%d-%d-%d", month, day, year);
   }
}
