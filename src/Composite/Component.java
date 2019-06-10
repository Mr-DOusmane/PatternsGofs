package Composite;

public abstract class Component {

    private String name;
    private  String description = "";

    Component(String name){
        this.name = name;
    }

    public boolean add(Component component) throws ComponentException{
        throw new ComponentException("I'm single component, i can not add other components.");
    }

    public boolean remove(Component component) throws ComponentException{
        throw new ComponentException("I'm single component, i don't have some components inside.");
    }

    public Component getChild(int index) throws ComponentException{
        throw new ComponentException("I'm single component, i don't have some components inside.");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName(){
        return this.name;
    }

    public abstract void describe();
}
