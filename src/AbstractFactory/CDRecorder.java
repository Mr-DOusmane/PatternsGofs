package AbstractFactory;

public class CDRecorder implements Recorder {

    private CD media;

    @Override
    public void accept(Media media) {
        this.media = (CD)media;
    }

    @Override
    public void record(String song) {
        if(media ==  null){
            System.out.println("Error, before you must choose an media. ");
        }
        else{
            this.media.svaeOnCD(song);
        }
    }
}
