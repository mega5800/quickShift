package Controller;

import Model.ContactInfo;
import Model.Employee;
import Model.MainModel;
import View.AddNewWorker;

import javax.swing.*;
import java.util.regex.Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

// The Controller coordinates interactions
// between the View and Model

public class Controller {

    private JFrame theView;
    private MainModel theModel;

    private ContactInfo m_ContactInfo;
    private  Employee m_Employee;

    public Controller(JFrame theView) {
        this.theView = theView;
    }

    public String addWorker(String...str) {
        if (checkIfEnoughTextWasEntered(str)) {
            if (str[1].matches("[0-9]+") && str[1].length() == 9) //checks ID
            {
                if (checkEmail(str[4]))
                {
                    if (str[6].matches("[0-9]+"))
                    {
                        m_ContactInfo = new ContactInfo(str[0], Integer.parseInt(str[1]), str[2], str[3], str[4]);
                        m_Employee = new Employee(str[8], str[5], Integer.parseInt(str[6]), str[7], m_ContactInfo);
                        /////////////////////// EXCEL //////////////////////////////////
                        return "שמירה בוצע בהצלחה";
                    }
                    else
                        return "הכנס מספר מחלקה";
                } else {
                    return "יש להזין כתובת דואל תקינה";
                }
            } else {
                return "יש להזין מספר תעודת זהות באורך 9 ספרות";
            }
        } else {
            return "יש למלא את כל הפרטים";
        }
    }

    private boolean checkIfEnoughTextWasEntered(String[]str)
    {
        for (int i=0;i<str.length;i++)
        {
            if (str[i].isEmpty())
                return false;
        }

        return true;
    }

    //if (m_IDText.getText().matches("[0-9]+") && m_IDText.getText().length() == 9) //checks ID

    public boolean checkEmail(String i_EmailToCheck) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        boolean resultToReturn = pattern.matcher(i_EmailToCheck).matches();

        return resultToReturn;
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
