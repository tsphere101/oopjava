import java.util.GregorianCalendar;
public class Lab0402 {

    public static void main(String[] args) {
        
        GregorianCalendar today = new GregorianCalendar();

        System.out.println("Current year, month, date, and day of week");
        log(today);

        System.out.println("---------");

        System.out.println("After specified the elapsed time of one day after current day");
        logTomorrow(today);


    }

    public static void logTomorrow(GregorianCalendar now)
    {
        long millis_a_day = 86400000;
        GregorianCalendar tmr = new GregorianCalendar();
        tmr.setTimeInMillis(now.getTimeInMillis()+millis_a_day);
        log(tmr);
        System.out.println(tmr.getTime());

    }

    public static void log(GregorianCalendar now)
    {
        System.out.println("Year is " + now.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + now.get(GregorianCalendar.MONTH));
        System.out.println("Date " + now.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + now.get(GregorianCalendar.DAY_OF_WEEK));

    }
    
}
