import java.util.Scanner;
public class Pro2_3_64010997 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter year : ");
        year = input.nextInt();
        int m;
        System.out.print("Enter month : ");
        m = input.nextInt();
        int q;
        System.out.print("Enter day : ");
        q = input.nextInt();
        String[] week = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        if(m == 1||m==2)
        {
            m += 12;
            year--;
        }
        int j = year/100;
        int k = year%1000;
        int h = (q+26*(m+1)/10+k/4+j/4+5*j)%7;
        System.out.print("the name of the day of the week is "+week[h]);
    }
}
