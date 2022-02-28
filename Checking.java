public class Checking extends Account {


    public double minBalance;

    public Checking() {

        this.minBalance = -50;

    }

    public Checking(int id, double newBalance)
    {
        super(id, newBalance);
        this.minBalance = -50;
    }

    public void withdraw(double amount) {

        if (this.getBalance() - amount < minBalance) {
            System.out.println("We cannot complete this transaction. \nIt will put you over your withdrawl limit.");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }
    public String toString() {

        return super.toString() + "\nOverdraft protection up to : $" + minBalance;

    }
}
