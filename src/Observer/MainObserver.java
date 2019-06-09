package Observer;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainObserver {

    public static void main(String[] args) {

        Patient patient = new Patient("Marco Pollo");
        ObsPatient1 obsPatient1 = new ObsPatient1("Observer-1");
        ObsPatient2 obsPatient2 = new ObsPatient2("Observer-2");

        patient.addObserver(obsPatient1);
        //patient.addObserver(obsPatient2);

        obsPatient1.opinion();

        IntStream.rangeClosed(0, 5).forEach(i -> {
            patient.tellSomeInt();
        });

        obsPatient1.opinion();
    }
}
