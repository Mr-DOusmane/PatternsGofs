package Decorator;

public class Developer implements Employee{

    private String name;
    private String office = "Software development";

    public Developer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getOffice() {
        return this.office;
    }

    @Override
    public void roles() {
        System.out.println("I am " + this.getName() + ", i'am work in " + this.getOffice() + " area.");
    }
}
