/*
 Controller class for calculator
 */
package mvccalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
    
    private CalcView view;
    private CalcModel model;
    
    public CalcController(CalcView view, CalcModel model){
        this.view = view;
        this.model = model;
        
        this.view.addCalcListener(new CalcListener());
    }
    
    class CalcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = view.getfirstNumber();
                secondNumber = view.getsecondNumber();
                
                model.add(firstNumber, secondNumber);
                
                view.setCalcSum(model.getsum());
            }
            catch(NumberFormatException ex){
                view.displayErrorMessage("Please enter two integers.");
            }
        }
    }
}

