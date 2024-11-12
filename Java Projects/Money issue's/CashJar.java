/**

 * Program to save money in a jar

 *

 * @author Anthony Chipner

 * @version January 28, 2022

 */
package hmwk03_04;
/**
 * main - N/A
 * 
 * @param       args command line arguments
 * @return      N/A
 */
public class CashJar {
    private int jarNum;
    private int jarGoal;
    private int jarAmount;
    private String money = "$";
    private String space = " ";
   
   /** 
    * Constructor - to set instance variables for object.
    * 
    * @param    jarNum,jarGoal,jarAmount    new value
    * return    void
    */
    CashJar(int jarNum, int jarGoal, int jarAmount) {
        this.jarNum = jarNum;
        this.jarGoal = jarGoal;
        this.jarAmount = jarAmount;
    }
    /**
     * getjarGoal
     * 
     * @return  jarGoal
    */
    public int getjarGoal() {
        return jarGoal;
    }
    /**
     * setjarGoal - update the current value of jarGoal
     * 
     * @param   jarGoal new value
     * @return  void
    */
    public void setjarGoal(int jarGoal) {
        this.jarGoal = jarGoal;
    }
    /**
     * getjarAmount
     * 
     * @return  jarAmount
    */
    public int getjarAmount() {
        return jarAmount;
    }
    /**
     * setjarAmount - update the current value of jarAmount
     * 
     * @param   jarAmount new value
     * @return  void
    */
    public void setjarAmount(int jarAmount) {
        this.jarAmount += jarAmount;
    }
    /**
     * getjarGoal
     * 
     * @return  jarGoal
    */
    public void display() {
        System.out.printf("| %d |%n|___|$%d of $%d", jarNum, jarAmount, jarGoal);
    }
}
