package View;


import javax.swing.*;


public class MenuFrame extends JFrame{
    private JButton reportHourButton;
    private JPanel sideBar;
    private JPanel topBar;
    private JPanel mainBar;
    private JPanel mainMenu;

    public MenuFrame(){
        this.add(mainMenu);
        this.setSize(1000,600);
        this.setTitle("QuickShift");
    }

}
