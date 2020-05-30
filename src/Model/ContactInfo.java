package Model;

import java.util.Date;

public class ContactInfo
{
    private int ID;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private Date birthDayDate;


    public ContactInfo(String firstName, String lastName, int ID, String gender, String address, String email, Date birthDayDate,String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.birthDayDate = birthDayDate;
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDayDate() {
        return birthDayDate;
    }

    public void setBirthDayDate(Date birthDayDate) {
        this.birthDayDate = birthDayDate;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "first name='" + firstName + '\'' +
                "last name='" + lastName + '\'' +
                ", ID=" + ID +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + email + '\'' +
                '}';
    }
}