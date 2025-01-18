package Clock;

public class Clock {
    // instance variables
    int hours;
    int minutes;


    // constructors

    public Clock() {
        hours = 12;
        minutes = 0;
    }

    public Clock(int hours, int minutes){
        this.minutes = minutes;
        this.hours = hours;
    }


    // accessors
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    // mutators


    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    public void next(){
        if(minutes == 59 && hours != 11) {
            minutes = 0;
            hours = (hours+1)%12;
        }
        else if(minutes == 59){
            minutes = 0;
            hours = 12;
        }
        else{
            minutes++;
        }

    }

    @Override
    public String toString(){
        return String.format("The time is %d:%02d",hours,minutes);
    }
}
