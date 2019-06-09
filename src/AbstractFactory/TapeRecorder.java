package AbstractFactory;

public class TapeRecorder implements Recorder {

    private Tape media;

    @Override
    public void accept(Media media) {
        this.media = (Tape) media;
    }

    @Override
    public void record(String song) {
        if(this.media == null){
            System.out.println("Error you must enter before media.");
        }
        else{
            media.saveOnTape(song);
        }
    }
}
