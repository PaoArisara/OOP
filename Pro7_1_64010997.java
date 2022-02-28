public class Pro7_1_64010997
{
    public static void main(String[] agrs){

        Account account = new Account(1,100);
        Saving save = new Saving(2,1000);
        Checking check = new Checking(3,500);
        
        System.out.println(account.toString());
        System.out.println(save.toString());
        System.out.println(check.toString());
    }
}