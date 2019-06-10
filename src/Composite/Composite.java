package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {


    private List<Component> components;

    public Composite(String name){
        super(name);
        this.components = new ArrayList<Component>();
    }

    public boolean add(Component component){
        return this.components.add(component);
    }

    public boolean remove(Component component){
        return this.components.remove(component);
    }

    public Component getChild(int index){
        return this.components.get(index);
    }

    @Override
    public void describe() {
        if(this.getDescription().length() <= 0) System.out.println("component : " + this.getName() + ", i don't have description : ");
        else System.out.println("component : " + this.getName() + ", with description : " + this.getDescription());
        for (Component c : components) {
            System.out.print(this.getName() + "---->  ");
            c.describe();
        }
    }

}
