import java.util.Scanner;

public class Pro6_4_64010997{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tax tax = new Tax();
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly  -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        System.out.print("\n(0-single filer, \n 1-married jointly or "
                + "qualifying widow(er), \n 2-married separately,\n 3-head of " + "household) \nEnter the filing status: ");
        int status = input.nextInt();
        if (status > 3) {
            System.out.println("Error, Invalid Filling Status");
            return;
        }

        // Prompt the user to enter taxable income
        System.out.print("\nEnter the taxable income: ");
        double income = input.nextDouble();


        System.out.printf("Tax is $%.2f", tax.calTax(income, brackets[status], rates));
        input.close();

    }

}