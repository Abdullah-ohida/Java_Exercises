package Exercise_3;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds){
        if(hour < 24){
            this.hour  = hour;
        }
        if(minutes < 59){
            this.minutes = minutes;
        }
        if(seconds < 60){
            this.seconds = seconds;
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
