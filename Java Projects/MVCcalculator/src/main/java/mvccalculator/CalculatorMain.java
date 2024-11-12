/*
Application to show a real world scenario of MVC Patterns and it uses. This program will take two integers and add them utilizing the MVC pattern.
 */

package mvccalculator;
public class CalculatorMain {

    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcController controller = new CalcController(view, model);
        
        view.setVisible(true);
    }
}
