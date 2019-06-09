package AbstractFactory;

public class TapePlayer implements Player{

    private Tape media;

    public TapePlayer(){}

    @Override
    public void accept(Media media) {
        this.media = (Tape)media;
    }

    @Override
    public String play() {
        if(media == null){
            System.out.println("Error, You must before enter media.");
        }
        else{
            return media.readTape();
        }
        return null;
    }
}
