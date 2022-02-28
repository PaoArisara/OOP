
public class Person {
    private String name,address,phoneNumber,emailAddress;

    public  Person()
    {

    }
    public Person(String name,String address,String phoneNumber,String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\n"+
        "Address: "+address+"\n"+
        "Phone: "+phoneNumber+"\n"+
        "Email: "+emailAddress+"\n"+
        String.format("Person{name=%s, address=%s, phone=%s, email=%s}",name,address,phoneNumber,emailAddress);
    }

}
