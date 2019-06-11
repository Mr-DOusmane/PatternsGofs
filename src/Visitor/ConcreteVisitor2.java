package Visitor;

import java.util.List;

public class ConcreteVisitor2 implements Visitor{

    @Override
    public void visit(List<Visitable> elements) {
        System.out.println("I'm : " + getClass().getName());
        for (Visitable elem : elements){
            elem.accept(this);
        }
    }

    @Override
    public void visit(Visitable element) {
        System.out.println("I'm : " + getClass().getName());
        element.operation();
    }
}
