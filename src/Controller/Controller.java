package Controller;

import Model.MainModel;
import View.MainFrame;

// The Controller coordinates interactions
// between the View and Model

public class Controller {

    private MainFrame theView;
    private MainModel theModel;

    public Controller(MainFrame theView, MainModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }


//    class CalculateListener implements ActionListener{
//
//        public void actionPerformed(ActionEvent e) {
//
//            int firstNumber, secondNumber = 0;
//
//            // Surround interactions with the view with
//            // a try block in case numbers weren't
//            // properly entered
//
//            try{
//
//                firstNumber = theView.getFirstNumber();
//                secondNumber = theView.getSecondNumber();
//
//                theModel.addTwoNumbers(firstNumber, secondNumber);
//
//                theView.setCalcSolution(theModel.getCalculationValue());
//
//            }
//
//            catch(NumberFormatException ex){
//
//                System.out.println(ex);
//
//                theView.displayErrorMessage("You Need to Enter 2 Integers");
//
//            }
//
//        }
//
//    }

}
