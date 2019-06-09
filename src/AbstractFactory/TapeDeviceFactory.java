package AbstractFactory;

public class TapeDeviceFactory implements DevicesFactory{
    @Override
    public Media createMedia() {
        return new Tape();
    }

    @Override
    public Recorder createRecorder() {
        return new TapeRecorder();
    }

    @Override
    public Player createPlayer() {
        return new TapePlayer();
    }
}
