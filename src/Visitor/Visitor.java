package Visitor;

import java.util.List;

public interface Visitor {


    public void visit(List<Visitable> elements);
    public void visit(Visitable element);
}
