package AbstractFactory;

public class CDDeviceFactory implements DevicesFactory{

    @Override
    public Media createMedia() {
        return new CD();
    }

    @Override
    public Recorder createRecorder() {
        return new CDRecorder();
    }

    @Override
    public Player createPlayer() {
        return new CDPlayer();
    }
}
