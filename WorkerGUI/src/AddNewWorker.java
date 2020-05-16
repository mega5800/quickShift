import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class AddNewWorker extends javax.swing.JFrame
{
    private JLabel m_WorkerLbl;
    private JTextField m_WorkerNameText;
    private JPanel m_MainPanel;
    private JLabel m_IDLbl;
    private JTextField m_IDText;
    private JLabel m_GenderLbl;
    private JComboBox m_ComboGenderBox;
    private JTextField m_AddressText;
    private JLabel m_AddressLbl;
    private JLabel m_EmailLbl;
    private JTextField m_EmailText;
    private JPanel m_PersonalInfoPanel;
    private JPanel m_WorkInfoPanel;
    private JTextField m_ManagerNameText;
    private JLabel m_ManagerName;
    private JLabel m_DepartmentNumLbl;
    private JTextField m_DepartmentNumText;
    private JLabel m_JobDescriptionLbl;
    private JTextField m_JobDescriptionText;
    private JLabel m_StartDateLbl;
    private JTextField m_StartDateText;
    private JPanel m_ButtonsPanel;
    private JButton m_SaveBtn;
    private JButton m_DeleteBtn;

    private Employee m_Employee;
    private ContactInfo m_ContactInfo;

    public AddNewWorker(String i_Title) throws HeadlessException
    {
        super(i_Title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(m_MainPanel);
        this.setSize(400,500);
        this.setLocationRelativeTo(null);

        setComponentsToTheRight();
        setNamesToGroups();
        setCurrentDate();

        m_SaveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkIfEnoughTextWasEntered())
                {
                    if (m_IDText.getText().matches("[0-9]+") && m_IDText.getText().length() == 9)
                    {
                        if (checkEmail())
                        {
                            m_ContactInfo=new ContactInfo(m_WorkerNameText.getText(),Integer.parseInt(m_IDText.getText())
                                    ,(String)m_ComboGenderBox.getSelectedItem(),m_AddressText.getText(),m_EmailText.getText());
                            m_Employee = new Employee(m_StartDateText.getText(),m_ManagerNameText.getText(),
                                    Integer.parseInt(m_DepartmentNumText.getText()),m_JobDescriptionText.getText(),m_ContactInfo);

                            cleanData();
                            System.out.print(m_Employee);
                        }
                        else
                        {
                            showMessageDialog(null, "יש להזין כתובת דואל תקינה");
                        }
                    }
                    else
                    {
                        showMessageDialog(null, "יש להזין מספר תעודת זהות באורך 9 ספרות");
                    }
                }
                else
                {
                    showMessageDialog(null, "יש למלא את כל הפרטים");
                }
            }
        });
        m_DeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanData();
            }
        });
    }

    private boolean checkEmail()
    {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        boolean resultToReturn =pattern.matcher(m_EmailText.getText()).matches();

        return  resultToReturn;
    }

    private void cleanData()
    {
        this.m_WorkerNameText.setText("");
        this.m_IDText.setText("");
        this.m_ComboGenderBox.setSelectedIndex(0);
        this.m_AddressText.setText("");
        this.m_EmailText.setText("");
        this.m_ManagerNameText.setText("");
        this.m_DepartmentNumText.setText("");
        this.m_JobDescriptionText.setText("");
        this.m_StartDateText.setText("");
    }

    private boolean checkIfEnoughTextWasEntered()
    {
        boolean boolToReturn = true;

        if (this.m_WorkerNameText.getText().isEmpty())
        {
            //this.m_WorkerNameText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_IDText.getText().isEmpty())
        {
            //this.m_IDText.setBackground(Color.red);
            boolToReturn=false;
        }
        if ((String)this.m_ComboGenderBox.getSelectedItem() == "")
        {
            //this.m_ComboGenderBox.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_AddressText.getText().isEmpty())
        {
            //this.m_AddressText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_EmailText.getText().isEmpty())
        {
            //this.m_EmailText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_ManagerNameText.getText().isEmpty())
        {
            //this.m_ManagerNameText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_DepartmentNumText.getText().isEmpty())
        {
            //this.m_DepartmentNumText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_JobDescriptionText.getText().isEmpty())
        {
            //this.m_JobDescriptionText.setBackground(Color.red);
            boolToReturn=false;
        }
        if (this.m_StartDateText.getText().isEmpty())
        {
            //this.m_StartDateText.setBackground(Color.red);
            boolToReturn = false;
        }

        return boolToReturn;
    }

    private void setCurrentDate()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.m_StartDateText.setText(formatter.format(date));
    }
    private void setComponentsToTheRight()
    {
        this.m_WorkerNameText.setHorizontalAlignment(SwingConstants.RIGHT);
        this.m_IDText.setHorizontalAlignment(SwingConstants.RIGHT);
        ((JLabel)this.m_ComboGenderBox.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        this.m_AddressText.setHorizontalAlignment(SwingConstants.RIGHT);
        this.m_ManagerNameText.setHorizontalAlignment(SwingConstants.RIGHT);
        this.m_DepartmentNumText.setHorizontalAlignment(SwingConstants.RIGHT);
        this.m_JobDescriptionText.setHorizontalAlignment(SwingConstants.RIGHT);
        this.m_StartDateText.setHorizontalAlignment(SwingConstants.RIGHT);
    }
    private void setNamesToGroups()
    {
        this.m_PersonalInfoPanel.setBorder(BorderFactory.createTitledBorder("פרטים אישיים"));
        this.m_WorkInfoPanel.setBorder(BorderFactory.createTitledBorder("פרטי העסקה"));
    }

    public static void main(String[] args)
    {
        JFrame mainFrame = new AddNewWorker("Add new worker");
        mainFrame.setVisible(true);
    }
}