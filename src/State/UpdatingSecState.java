package State;

public class UpdatingSecState implements ClockState{

    private Clock clock;

    public UpdatingSecState(Clock clock){
        this.clock = clock;
    }

    @Override
    public void modeButton() {
        this.clock.setClockState(new NormalDisplayState(this.clock));
    }

    @Override
    public void changeButton() {
        if(this.clock.seconds == 59) this.clock.seconds = 0;
        else this.clock.seconds++;
        System.out.println("You increment seconde.");
    }
}
