package AbstractFactory;

public class CD implements Media {

    private String song = "";

    public CD(){}

    public void svaeOnCD(String song){
        this.song = song;
    }

    public String readCD(){
        return this.song;
    }
}
