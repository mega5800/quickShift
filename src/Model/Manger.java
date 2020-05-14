package Model;

import java.util.ArrayList;
import java.util.Date;

public class Manger extends Employee {

    private ArrayList<Employee> employeeList;

    public Manger(Date hireDate, String mangerName, int departmentNumber, String description, ContactInfo contactInfo, ArrayList<Employee> employeeList) {
        super(hireDate, mangerName, departmentNumber, description, contactInfo);
        this.employeeList = employeeList;
    }


    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

}
