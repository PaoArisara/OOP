import java.util.Scanner;

public class Pro6_1_64010997
{
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.next();
        System.out.print("Enter age : ");
        int age = input.nextInt();
        System.out.print("Enter weight (pound) : ");
        double weight = input.nextDouble();
        System.out.print("Enter height (inches) : ");
        double height = input.nextDouble();
      
        BMI bmi = new BMI(name,age,weight,height);
        
        if(bmi.getbmi() < 18.5)
        {
            System.out.println(bmi.getbmi());
            System.out.println("name : "+name);
            System.out.println("Underweight");
        }
        if((bmi.getbmi()>=18.5) && (bmi.getbmi()<25.0))
        {
            System.out.println(bmi.getbmi());
            System.out.println("name : "+name);
            System.out.println("Normal");
        }
        if((bmi.getbmi()>=25.0) && (bmi.getbmi()<30.0))
        {
            System.out.println(bmi.getbmi());
            System.out.println("name : "+name);
            System.out.println("Overweight");
        }
        if(bmi.getbmi() >= 30.0)
        {
            System.out.println(bmi.getbmi());
            System.out.println("name : "+name);
            System.out.println("Obese");
        }

    }
}