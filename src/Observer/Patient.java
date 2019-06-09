package Observer;

import java.util.Observable;

public class Patient extends Observable {

    private String name;
    private int randInt;

    public Patient(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void tellSomeInt(){
        randInt = (int) (Math.random() * 10);
        setChanged();
        notifyObservers();
    }

    public int getRandInt() {
        return this.randInt;
    }

}
