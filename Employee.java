import java.util.Date;

public class Employee extends Person {

    private String office;
    private int salary;
    private Date dateHired; 

    public Employee(String name,String address,String phoneNumber,String emailAddress,String office,int salary){
        super(name, address, phoneNumber, emailAddress);
        this.office =office;
        this.salary =salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Employee{office=%s, salary=%s, dateHired=%s}", office,salary,dateHired);
    }

}
