public class Pro1_1_64010997 {
    public static void main(String[] args) {
        long sec = 60,min=60;
        long day = 24*min*sec;
        long year = day*365;
        long now = 312032486;

        double birth = year/7.0;
        double death = year/13.0;
        double im = year/45.0;

        now += birth+im;
        now -= death;
        System.out.println("Year1 = "+now);
      
        now += birth+im;
        now -= death;
        System.out.println("Year2 = "+now);
     
        now += birth+im;
        now -= death;
        System.out.println("Year3 = "+now);
   
        now += birth+im;
        now -= death;
        System.out.println("Year4 = "+now);
      
        now += birth+im;
        now -= death;
        System.out.println("Year5 = "+now);

      }
}