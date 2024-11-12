/*
 * This model will be peforming all calculations needed for the data given.
 */
package mvccalculator;


public class CalcModel {
    private int sum;
    
    public void add(int firstNumber, int secondNumber){
        sum = firstNumber + secondNumber;
    }
    
    public int getsum(){
        return sum;
    }
}
