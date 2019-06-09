package Singleton;

public class Singleton3 {

    private String name;
    private static Singleton3 singleton3 = null;

    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        if(singleton3 == null){
            singleton3  = new Singleton3();
        }
        return singleton3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void print(){
        System.out.println("My name is : " + getName());
    }
}
