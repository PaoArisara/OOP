public class StopWatch {
    long startTime = System.currentTimeMillis();
    long endTime = startTime;

    public long getstart()
    {
        return this.startTime;
    }

    public long getstop()
    {
        return this.endTime;
    }

    public void start()
    {
        this.startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime()
    {
        return this.endTime-this.startTime;
    }
}
