import java.util.Scanner;

public class Pro8_1_64010997 {
    public static void main(String[] args) throws Exception {
        
                double side1, side2, side3;
                String color = "";
                boolean isFilled;
        
                try (Scanner input = new Scanner(System.in);) {
        
                    System.out.print("Please Enter the 3 sides of the triangle now: ");
                    side1 = input.nextDouble();
                    side2 = input.nextDouble();
                    side3 = input.nextDouble();
        
                    System.out.print("Now enter a color and true or false: ");
        
                    color = input.next();
                    isFilled = input.nextBoolean();
                }
        
                Triangle triangle = new Triangle(side1, side2, side3);
        
                triangle.setFilled(isFilled);
                triangle.setColor(color);
        
                System.out.println("The area of the triangle is " + triangle.getArea() +
                        "\nThe Perimeter  is " + triangle.getPerimeter() +
                        "\nIts color is  " + triangle.getColor() +
                        "\nIts filled  is  " + triangle.isFilled());
            }
        
    }

    