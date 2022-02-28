import java.util.Scanner;

public class Pro2_5_64010997 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter 1-15 : ");
            int num = input.nextInt();
            for (int i = 0; i < num; i++) { 
                    System.out.print(" ".repeat((num-i-1)*2));

                for (int k = i; k >= -i; k--) { 
                    System.out.print((Math.abs(k)+1)+" ");
                }
                System.out.println();
            }
        }
            
    }
