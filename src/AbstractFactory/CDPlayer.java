package AbstractFactory;

public class CDPlayer implements Player{

    private CD media;

    public CDPlayer(){}

    @Override
    public void accept(Media media) {
        this.media = (CD)media;
    }

    @Override
    public String play() {
        if(media == null){
            System.out.println("Error, you must before enter media.");
        }
        else{
            return media.readCD();
        }
        return null;
    }
}
