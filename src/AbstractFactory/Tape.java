package AbstractFactory;

public class Tape implements Media {

    private String song = "";

    public Tape(){}

    public void saveOnTape(String song){
        this.song = song;
    }

    public String readTape(){
        return this.song;
    }
}
