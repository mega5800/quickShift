package View;


import javax.swing.*;
import java.awt.event.ActionListener;


public class MenuFrame extends JFrame{
    private JButton reportHourBtn;
    private JPanel sideBar;
    private JPanel topBar;
    private JPanel mainBar;
    private JPanel mainMenu;
    private JButton addEmployeeBtn;
    private JLabel gratingLbl;

    public MenuFrame(){
        this.add(mainMenu);
        this.setSize(1000,600);
        this.setTitle("QuickShift");
    }

    public void setGratingMessage (String fistName,String lastName){
        this.gratingLbl.setText("Welcome Back "+fistName+" "+lastName);
    }

    public void reportHourBtnListener(ActionListener listenForReportHourBtn){
        reportHourBtn.addActionListener(listenForReportHourBtn);}

    public void addAddEmployeeListener(ActionListener listenForAddEmployeeBtn){addEmployeeBtn.addActionListener(listenForAddEmployeeBtn);}

}
