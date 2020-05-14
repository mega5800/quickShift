package Model;

import java.util.Date;

public class Employee {

    private Date hireDate;
    private String mangerName;
    private int departmentNumber;
    private String description;
    private ContactInfo contactInfo;

    public Employee(Date hireDate, String mangerName, int departmentNumber, String description, ContactInfo contactInfo) {
        this.hireDate = hireDate;
        this.mangerName = mangerName;
        this.departmentNumber = departmentNumber;
        this.description = description;
        this.contactInfo = contactInfo;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
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
}