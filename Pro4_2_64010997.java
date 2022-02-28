import java.util.GregorianCalendar;

public class Pro4_2_64010997{
    public static void main(String[] args) 
    {
        GregorianCalendar calender = new GregorianCalendar(); 
        GregorianCalendar aftercalender = new GregorianCalendar(); 
        calender.setTimeInMillis(System.currentTimeMillis());
        aftercalender.setTimeInMillis(System.currentTimeMillis()+86400000);

        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+calender.get(calender.YEAR));
        System.out.println("Month is "+calender.get(calender.MONTH));
        System.out.println("Date is  "+calender.get(calender.DATE));
        System.out.println("Day of week is "+calender.get(calender.DAY_OF_WEEK));
        System.out.println(".....................");
        System.out.println("After specified the elasped time of one day afer current day");
        System.out.println("Year is "+aftercalender.get(aftercalender.YEAR));
        System.out.println("Month is "+aftercalender.get(aftercalender.MONTH));
        System.out.println("Date is  "+aftercalender.get(aftercalender.DATE));
        System.out.println("Day of week is "+aftercalender.get(aftercalender.DAY_OF_WEEK));
        System.out.println(aftercalender.getTime());
    }
}