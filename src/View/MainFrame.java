package View;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame{


    private JTextField textFName;
    private JButton submit;
    private JTextField textLName;
    private JPanel mainPanel = new JPanel();

    public MainFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);

        mainPanel.add(textFName);
        mainPanel.add(submit);
        mainPanel.add(textLName);

        this.add(mainPanel);

    }

}
