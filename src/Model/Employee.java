package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
    private Login login;
    private String hireDate;
    private String mangerName;
    private int departmentNumber;
    private String description;
    private ContactInfo contactInfo;

    public Employee(String hireDate, String mangerName, int departmentNumber, String description, ContactInfo contactInfo,Login login)
    {
        this.login = login;
        this.hireDate = hireDate;
        this.mangerName = mangerName;
        this.departmentNumber = departmentNumber;
        this.description = description;
        this.contactInfo = contactInfo;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getMangerName() {
        return mangerName;
    }

    public void setMangerName(String mangerName) {
        this.mangerName = mangerName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void insertNewClient(){
        Connection con = ConnectionManager.getConnection();

        String username = this.login.getUsername();
        String password = this.login.getPassword();
        String email = this.contactInfo.getEmail();
        String firstName = this.contactInfo.getFirstName();
        String lastName = this.contactInfo.getLastName();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //java.sql.Date birthDate = new java.sql.Date(this.contactInfo.getBirthDate().getTime());


        java.sql.Date birthDate = convertUtilToSql(this.contactInfo.getBirthDayDate());



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        try{
            String query = "INSERT INTO logininfo(username,password,email,firstName,lastName,birthDate) VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1,username);
            prepStmt.setString(2,password);
            prepStmt.setString(3,email);
            prepStmt.setString(4,firstName);
            prepStmt.setString(5,lastName);
            prepStmt.setDate(6,birthDate);
            prepStmt.executeUpdate();
            prepStmt.close();
        }catch (SQLException throwable){
            throwable.printStackTrace();
        }
    }

    public void updateClient() {
        Connection con = ConnectionManager.getConnection();

        String username = this.login.getUsername();
        String password = this.login.getPassword();

        try {
            String query = "UPDATE logininfo SET username = ?, password = ? WHERE username = ?";
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1,username);
            prepStmt.setString(2,password);
            prepStmt.setString(3,username);
            prepStmt.executeUpdate();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        return new java.sql.Date(uDate.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                ", mangerName='" + mangerName + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", description='" + description + '\'' +
                ", contact Info=" + contactInfo.toString() +
                '}';
    }
}