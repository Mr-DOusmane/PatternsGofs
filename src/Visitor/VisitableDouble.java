package Visitor;

public class VisitableDouble implements Visitable{

    private double val;

    public VisitableDouble(double val){
        this.val = val;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation(){
        System.out.println("Double -->> " + this.val);
    }
}
