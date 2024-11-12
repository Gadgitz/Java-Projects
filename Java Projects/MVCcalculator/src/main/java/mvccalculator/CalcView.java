/*
Interface portion for the calculator.
 */
package mvccalculator;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CalcView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel addLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calcButton = new JButton("Calculate");
    private JTextField calcSum = new JTextField(10);
    
    CalcView(){
        
        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(addLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calcButton);
        calcPanel.add(calcSum);
        
        this.add(calcPanel);
    }
    
    public int getfirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getsecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getcalcSum(){
        return Integer.parseInt(calcSum.getText());
    }
    
    public void setCalcSum(int sum){
    calcSum.setText(Integer.toString(sum));
    }
    
    void addCalcListener(ActionListener listenForCalcButtonPress){
        calcButton.addActionListener(listenForCalcButtonPress);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
