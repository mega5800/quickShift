package View;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class registerFrame extends JFrame {
    private JTextField usernameField;
    private JRadioButton carOwnCheck;
    private JPasswordField passwordField;
    private JPanel registrationFrame;
    private JTextField fNameField;
    private JTextField lNameField;
    private JButton registerBtn;
    private JTextField emailField;
    private JComboBox<String> genderBox;
    private JComboBox departmentNumCBox;
    private JTextField mangerNameTxt;
    private JTextField descriptionTxt;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel departInfoJPan;
    private JRadioButton departEnableJRad;
    private String[] gender = {"","Male","Female"};

    private JPanel hireDateJPanel;
    private JPanel birthdayJPanel;

    Calendar cld = Calendar.getInstance();
    JDateChooser dateChooseHireD = new JDateChooser(cld.getTime());
    JDateChooser dateChooseBDay = new JDateChooser(cld.getTime());

    public registerFrame() {
        this.add(registrationFrame);
        this.setTitle("Add employee");
        this.setSize(660,560);

        this.dateChooseHireD.setDateFormatString("dd/MM/yyyy");
        this.dateChooseBDay.setDateFormatString("dd/MM/yyyy");

        this.birthdayJPanel.add(dateChooseHireD);
        this.hireDateJPanel.add(dateChooseBDay);

        this.genderBox.addItem(gender[0]);
        this.genderBox.addItem(gender[1]);
        this.genderBox.addItem(gender[2]);

        departEnableJRad.addActionListener(e -> {
            if(departEnableJRad.isSelected()) departInfoJPan.setVisible(true);
            else departInfoJPan.setVisible(false);
        });
    }

    public String getFName(){
        return this.fNameField.getText();
    }

    public String getLName(){
        return this.lNameField.getText();
    }

    public String getUsername(){
        return this.usernameField.getText();
    }

    public String getPassword(){
        return String.valueOf(this.passwordField.getPassword());
    }

    public Date getDate(){
        return this.dateChooseHireD.getDate();
    }

    public String getEmail(){
        return this.emailField.getText();
    }

    public boolean getCarOwner(){
        return this.carOwnCheck.isSelected();
    }

    public String getGender(){
        return this.genderBox.getSelectedItem().toString();
        //Warning:Method invocation 'toString' may produce 'NullPointerException'//
    }

    public void addRegisterListener (ActionListener listenForRegisterBtn){registerBtn.addActionListener(listenForRegisterBtn);}

}
