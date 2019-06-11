package Visitor;

import java.util.ArrayList;
import java.util.List;

public class MainVisitor {

    public static void main(String[] args) {

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        Visitable visitableDouble = new VisitableDouble(2.258);
        Visitable visitableInt = new VisitableInt(78);
        Visitable visitableString = new VisitableString("ousmane");

        visitableDouble.accept(concreteVisitor);
        visitableInt.accept(concreteVisitor2);
        visitableString.accept(concreteVisitor2);

        List<Visitable> elements = new ArrayList<>();
        elements.add(visitableDouble);
        elements.add(visitableInt);
        elements.add(visitableString);
        System.out.println("----------------------");
        concreteVisitor.visit(elements);
        System.out.println("----------------------");
        concreteVisitor2.visit(elements);


    }
}
