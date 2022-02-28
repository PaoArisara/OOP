public class Pro6_5_64010997
{

        static final String COLUMN_HEADER = "Taxable Income |  Single Filer | Married jointly |  Married Separately |" +
            "  Head " +
            "Of House";

    public static void main(String[] args) {

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly  -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        printH2();
        for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 1000) {

            System.out.printf("\t%d", taxableIncome);

            Tax taxHelper = new Tax(Tax.SINGLE_FILER, brackets, rates, taxableIncome);
            System.out.printf("\t\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER);
            System.out.printf("\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("\t\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("\t\t\t %.2f" + "\n", taxHelper.getTax());


        }
    }

    static void printH2() {
        System.out.println(COLUMN_HEADER);
    }
}