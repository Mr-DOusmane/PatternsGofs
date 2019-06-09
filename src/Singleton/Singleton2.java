package Singleton;

public class Singleton2 {

    // if this singleton used in the context where multiple thread run is not efficient.
    // In the singleton3 there are some modification, you must add in the getInstance method synchronized.

    private String name;
    private static Singleton2 singleton2 = null;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2  = new Singleton2();
        }
        return singleton2;
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
