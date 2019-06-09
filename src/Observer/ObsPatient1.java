package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObsPatient1 implements Observer {

    private String name;
    private int lowNum = 0, greatNum = 0;

    public ObsPatient1(String name){
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        Patient p = (Patient) observable;
        if(p.getRandInt() > 5){
            greatNum++;
            System.out.println("Good you tell great number : " + p.getRandInt() + ", of coast");
        }
        else{
            lowNum++;
            System.out.println("You tell least number : " + p.getRandInt() + ", of coast");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void opinion(){
        if((lowNum == greatNum) && (greatNum != 0)){
            System.out.println("Opinion of: Mr. " + getName() + ",You like both type number.");
        }
        else if(lowNum > greatNum){
            System.out.println("Opinion of: Mr. " + getName() + "You like lower number.");
        }

        else if(lowNum < greatNum){
            System.out.println("Opinion of: Mr. " + getName() + "You like greater number.");
        }

        else{
            System.out.println("Opinion of: Mr. " + getName() + "You don't tell nothing i can't give my opinion.");
        }
    }
}
