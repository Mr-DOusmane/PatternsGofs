package Visitor;

public class VisitableString implements Visitable{

    private String string;

    public VisitableString(String string){
        this.string = string;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation(){
        System.out.println("String -->> " + this.string);
    }
}
