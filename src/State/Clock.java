package State;

public class Clock {

    private ClockState clockState = new NormalDisplayState(this);

    protected int hours = 0, minutes = 0, seconds =0;

    public void setTime(int hours, int minutes, int seconds){
        if(hours >=0 && hours < 24) this.hours = hours;
        if(minutes >=0 && minutes < 60) this.minutes = minutes;
        if(seconds >= 0 && seconds < 60) this.seconds = seconds;
    }

    public void setClockState(ClockState clockState) {
        this.clockState = clockState;
    }

    public void modeButton(){
        if(this.clockState != null) this.clockState.modeButton();
        else {
            System.out.println("You must set, Clockstate for this clock.");
        }
    }

    public void changeButton(){
        if(this.clockState != null) this.clockState.changeButton();
        else {
            System.out.println("You must set, Clockstate for this clock.");
        }
    }

    public void displayTime(){
        String hour = (hours > 9 ? hours : ("0" + hours)) + "H ";
        String min = (minutes > 9 ? minutes : ("0" + minutes)) + "Min ";
        String sec = (seconds > 9 ? seconds : ("0" + seconds)) + "Sec ";
        System.out.println(hour + min + sec);
    }
}
