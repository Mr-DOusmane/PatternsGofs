package Visitor;

public class VisitableInt implements Visitable{

    private int val;

    public VisitableInt(int val){
        this.val = val;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation(){
        System.out.println("Int -->> " + this.val);
    }
}
