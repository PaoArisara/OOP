public class Saving extends Account{

    public double minBalance;

    public Saving() {

        this.minBalance = 0;

    }
    public Saving(int id, double newBalance)
    {
        super(id, newBalance);
        this.minBalance = 0;
    }

    public void withdraw(double amount) {

        if (this.getBalance() - amount < minBalance) {
            System.out.println("We cannot complete this transaction. \nIt will put you over your withdrawl limit.");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }

    public String toString() {

        return super.toString() + "\nOverdraft protection not included";
    }

}

