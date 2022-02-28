import java.util.Scanner;

public class Pro1_4_64010997 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        float wp;
        float hn;
        System.out.print("Enter weight in pounds: ");
        wp = sn.nextFloat();
        System.out.print("Enter height in intches: ");
        hn = sn.nextFloat();
        //start
        double p =0.45359237;
        double in =0.0254;
        double weight = wp*p;
        double height = hn*in;
        double BMI = weight/(height*height);
        System.out.printf("BMI is %.4f\n", BMI);
    }
}
