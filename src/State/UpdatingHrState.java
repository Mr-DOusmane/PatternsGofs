package State;

public class UpdatingHrState implements ClockState{

    private Clock clock;

    public UpdatingHrState(Clock clock){
        this.clock = clock;
    }

    @Override
    public void modeButton() {
        this.clock.setClockState(new UpdatingMinState(clock));
    }

    @Override
    public void changeButton() {
        if(this.clock.hours == 23) this.clock.hours = 0;
        else this.clock.hours++;
        System.out.println("You increment hours.");
    }
}
