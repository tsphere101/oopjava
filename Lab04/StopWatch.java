import java.util.GregorianCalendar;

public class StopWatch {

    private long startTime;
    private long endTime;

    public StopWatch() 
    {
    }


    // Encapsulation
    public long getEndTime() {
        return endTime;
    }public long getStartTime() {
        return startTime;
    }

    // Method
    public void start()
    {
        GregorianCalendar now = new GregorianCalendar();
        // set to current time
        long millis = now.get(GregorianCalendar.MILLISECOND) + 1000*now.get(GregorianCalendar.SECOND)*now.get(GregorianCalendar.MINUTE)
        *now.get(GregorianCalendar.HOUR);
        this.startTime = millis;
    }

    public void stop()
    {
        GregorianCalendar now = new GregorianCalendar();
        // *STOP*
        // Set end time to current time
        long millis = now.get(GregorianCalendar.MILLISECOND) + 1000*now.get(GregorianCalendar.SECOND)*now.get(GregorianCalendar.MINUTE)
        *now.get(GregorianCalendar.HOUR);

        this.endTime = millis;
    }

    public long getElapseTime()
    {
        // In milis return the difference of startTIme and endTime
        return this.endTime-this.startTime;
    }
    
}
