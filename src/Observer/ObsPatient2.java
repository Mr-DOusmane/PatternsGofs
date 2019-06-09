package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObsPatient2 implements Observer {

    private String name;

    public ObsPatient2(String name){
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        Patient p = (Patient) observable;
        System.out.println("Patient is changed state, nice");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
