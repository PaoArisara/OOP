public class Faculty extends Employee{
    private String officehour;
    private int rank;

    public Faculty(String name,String address,String phoneNumber,String emailAddress,String office,int salary,String officehour,int rank){
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officehour = officehour;
        this.rank = rank;
    }

    public String getOfficehour() {
        return this.officehour;
    }

    public void setOfficehour(String officehour) {
        this.officehour = officehour;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+String.format("Faculty{officehour=%s, rank=%s}", officehour,rank);
    }

}
