package AbstractFactory;

public interface DevicesFactory {

    public Media createMedia();
    public Recorder createRecorder();
    public Player createPlayer();
}
