import java.util.Scanner;

public class Pro2_1_64010997 {
    public static void main(String[] args) {
        String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sn = new Scanner(System.in);
        int now;
        System.out.print("Enter today's day : ");
        now = sn.nextInt();
        int next;
        System.out.print("Enter the number of day : ");
        next = sn.nextInt();
        System.out.println("Today is "+day[now]+" and the future day is "+day[now + (next%7)]);
    }
}
