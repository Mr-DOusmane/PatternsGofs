package State;

public class UpdatingMinState implements ClockState{

    private Clock clock;

    public UpdatingMinState(Clock clock){
        this.clock = clock;
    }

    @Override
    public void modeButton() {
        this.clock.setClockState(new UpdatingSecState(this.clock));
    }

    @Override
    public void changeButton() {
        if(this.clock.minutes == 59) this.clock.minutes = 0;
        else this.clock.minutes++;
        System.out.println("You increment minute.");
    }
}
