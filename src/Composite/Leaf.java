package Composite;

public class Leaf extends Component{

    Leaf(String name){
        super(name);
    }

    @Override
    public void describe() {
        if(this.getDescription().length() <= 0) System.out.println("component : " + this.getName() + ", i don't have description : ");
        else System.out.println("component : " + this.getName() + ", with description : " + this.getDescription());
    }
}
