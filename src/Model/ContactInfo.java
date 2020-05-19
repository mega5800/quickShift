package Model;

public class ContactInfo
{
    private String name;
    private int ID;
    private String gender;
    private String address;
    private String emailAddress;

    public ContactInfo(String name, int ID, String gender, String address, String emailAddress) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.address = address;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}