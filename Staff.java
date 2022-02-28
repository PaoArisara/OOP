public class Staff extends Employee {
    private String title;

    public Staff(String name,String address,String phoneNumber,String emailAddress,String office,int salary,String title){
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title=title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+String.format("staff{title=%s}", title);
    }

    }
    
