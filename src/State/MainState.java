package State;

public class MainState {

    public static void main(String[] args) {

        Clock clock = new Clock();
        clock.setClockState(new NormalDisplayState(clock));
        clock.setTime(23, 57, 23);

        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
        clock.modeButton();
        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
        clock.modeButton();
        clock.changeButton();
        clock.changeButton();
        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
        clock.modeButton();
        clock.changeButton();
        clock.changeButton();
        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
        clock.modeButton();
        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
        clock.modeButton();
        clock.changeButton();
        clock.displayTime();
        System.out.println("-------------------------");
    }
}
