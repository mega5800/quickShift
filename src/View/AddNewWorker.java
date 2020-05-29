//package View;
//
//import Controller.Controller;
//import Model.*;
//import static javax.swing.JOptionPane.showMessageDialog;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//
//public class AddNewWorker extends javax.swing.JFrame
//{
//    private JLabel m_WorkerLbl;
//    private JTextField m_WorkerNameText;
//    private JPanel m_MainPanel;
//    private JLabel m_IDLbl;
//    private JTextField m_IDText;
//    private JLabel m_GenderLbl;
//    private JComboBox m_ComboGenderBox;
//    private JTextField m_AddressText;
//    private JLabel m_AddressLbl;
//    private JLabel m_EmailLbl;
//    private JTextField m_EmailText;
//    private JPanel m_PersonalInfoPanel;
//    private JPanel m_WorkInfoPanel;
//    private JTextField m_ManagerNameText;
//    private JLabel m_ManagerName;
//    private JLabel m_DepartmentNumLbl;
//    private JTextField m_DepartmentNumText;
//    private JLabel m_JobDescriptionLbl;
//    private JTextField m_JobDescriptionText;
//    private JLabel m_StartDateLbl;
//    private JTextField m_StartDateText;
//    private JPanel m_ButtonsPanel;
//    private JButton m_SaveBtn;
//    private JButton m_DeleteBtn;
//
//    private Employee m_Employee;
//    private ContactInfo m_ContactInfo;
//    private static Controller m_Controller;
//
//    public AddNewWorker(String i_Title) throws HeadlessException
//    {
//        super(i_Title);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setContentPane(m_MainPanel);
//        this.setSize(400,500);
//        this.setLocationRelativeTo(null);
//
//        setComponentsToTheRight();
//        setNamesToGroups();
//        setCurrentDate();
//        if (m_Controller == null) {
//            //this.m_Controller = new Controller(this);
//        }
//
//        m_SaveBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String strToPrint = m_Controller.addWorker(m_WorkerNameText.getText(),m_IDText.getText(),(String)m_ComboGenderBox.getSelectedItem(),
//                        m_AddressText.getText(),m_EmailText.getText(),m_ManagerNameText.getText(),m_DepartmentNumText.getText()
//                ,m_JobDescriptionText.getText(),m_StartDateText.getText());
//
//                showMessageDialog(null, strToPrint);
//            }
//        });
//        m_DeleteBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                cleanData();
//            }
//        });
//    }
//
//
//    private void cleanData()
//    {
//        this.m_WorkerNameText.setText("");
//        this.m_IDText.setText("");
//        this.m_ComboGenderBox.setSelectedIndex(0);
//        this.m_AddressText.setText("");
//        this.m_EmailText.setText("");
//        this.m_ManagerNameText.setText("");
//        this.m_DepartmentNumText.setText("");
//        this.m_JobDescriptionText.setText("");
//        this.m_StartDateText.setText("");
//    }
//
//
//
//    private void setCurrentDate()
//    {
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        this.m_StartDateText.setText(formatter.format(date));
//    }
//    private void setComponentsToTheRight()
//    {
//        this.m_WorkerNameText.setHorizontalAlignment(SwingConstants.RIGHT);
//        this.m_IDText.setHorizontalAlignment(SwingConstants.RIGHT);
//        ((JLabel)this.m_ComboGenderBox.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
//        this.m_AddressText.setHorizontalAlignment(SwingConstants.RIGHT);
//        this.m_ManagerNameText.setHorizontalAlignment(SwingConstants.RIGHT);
//        this.m_DepartmentNumText.setHorizontalAlignment(SwingConstants.RIGHT);
//        this.m_JobDescriptionText.setHorizontalAlignment(SwingConstants.RIGHT);
//        this.m_StartDateText.setHorizontalAlignment(SwingConstants.RIGHT);
//    }
//    private void setNamesToGroups()
//    {
//        this.m_PersonalInfoPanel.setBorder(BorderFactory.createTitledBorder("פרטים אישיים"));
//        this.m_WorkInfoPanel.setBorder(BorderFactory.createTitledBorder("פרטי העסקה"));
//    }
//
//    public static void main(String[] args)
//    {
//        JFrame mainFrame = new AddNewWorker("Add new worker");
//        mainFrame.setVisible(true);
//    }
//}