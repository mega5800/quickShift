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
    private JPanel jDatePanel;
    private JTextField emailField;
    private JComboBox<String> genderBox;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel carOwnerFields;
    private String[] gender = {"","male","Female"};

    Calendar cld = Calendar.getInstance();
    JDateChooser dateChoose = new JDateChooser(cld.getTime());

    public registerFrame() {
        this.add(registrationFrame);
        this.setTitle("Reg - CertifiCar v1.0");
        this.setSize(580,620);

        this.dateChoose.setDateFormatString("dd/MM/yyyy");
        this.jDatePanel.add(dateChoose);

        this.genderBox.addItem(gender[0]);
        this.genderBox.addItem(gender[1]);
        this.genderBox.addItem(gender[2]);

        carOwnCheck.addActionListener(e -> {
            if(carOwnCheck.isSelected()) carOwnerFields.setVisible(true);
            else carOwnerFields.setVisible(false);
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
        return this.dateChoose.getDate();
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
