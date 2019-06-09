package AbstractFactory;

public class Client {

    private String name;
    private DevicesFactory technology;

    public Client(String name){
        this.name = name;
    }

    public void selectTechnology(DevicesFactory devicesFactory){
        this.technology = devicesFactory;
    }

    public void test(String song){
        Media media = technology.createMedia();
        Recorder recorder = technology.createRecorder();
        Player player = technology.createPlayer();

        System.out.println("Your name is : " + this.name);


        System.out.println("You set you media, for save song");
        recorder.accept(media);
        System.out.println("Now you saving an song on the device...");
        recorder.record(song);

        System.out.println("You set you media, for play song");
        //player.accept(media);
        System.out.println("Now you playing an song from the device...");
        System.out.println(player.play());

    }
}
