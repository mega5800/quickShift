package View;


import javax.swing.*;
import java.awt.event.ActionListener;


public class MenuFrame extends JFrame{
    private JButton reportHourBtn;
    private JPanel sideBar;
    private JPanel topBar;
    private JPanel mainBar;
    private JPanel mainMenu;

    public MenuFrame(){
        this.add(mainMenu);
        this.setSize(1000,600);
        this.setTitle("QuickShift");
    }

    public void reportHourBtnListener(ActionListener listenForReportHourBtn){
        reportHourBtn.addActionListener(listenForReportHourBtn);}

}
