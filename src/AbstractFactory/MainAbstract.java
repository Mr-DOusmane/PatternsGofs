package AbstractFactory;

public class MainAbstract {

    public static void main(String[] args) {

        Client client = new Client("Mr. DO");

        client.selectTechnology(new TapeDeviceFactory());
        client.test("Moto, Moto -> moto, moto ............... moto, moto");
    }
}
