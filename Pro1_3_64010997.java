import java.util.Scanner;

public class Pro1_3_64010997 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number;
        System.out.print("Enter a number between 0 and 1000: ");
        number = sn.nextInt();
        //start
        int x = number%10;
        int e = number/10;
        int y = e%10;
        int z = e/10;
        int result = x+y+z;
        System.out.print("The sum of the digits is "+result);
    }
}
