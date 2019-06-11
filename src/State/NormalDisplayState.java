package State;

public class NormalDisplayState implements ClockState{


    private Clock clock;

    public NormalDisplayState(Clock clock){
        this.clock = clock;
    }

    @Override
    public void modeButton() {
        this.clock.setClockState(new UpdatingHrState(this.clock));
    }

    @Override
    public void changeButton() {
        System.out.println("display high light, light of clock is on <<< ---ok--- >>>>");
    }
}
