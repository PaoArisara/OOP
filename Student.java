public class Student extends Person {

    private int Status;
    public static final int FRESHMAN =1;
    public static final int SOPHOMORE =2;
    public static final int JUNIOR =3;
    public static final int SENIOR =4;
    private static final String[] NAMES={"FRESHMAN","SOPHOMORE","JUNIOR","SENIOR"};

    public Student(String name,String address,String phoneNumber,String emailAddress,int Status){
        super(name, address, phoneNumber, emailAddress);
        this.Status=Status;
    }

    public int getStatus() {
        return Status;
    }
    public void setStatus(int status) {
        Status = status;
    }
   @Override
   public String toString() {
       return super.toString()+String.format(" Student{status=%s}", NAMES[Status-1]);
   }
    
}
