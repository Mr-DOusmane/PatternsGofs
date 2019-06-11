package Visitor;

public interface Visitable {

    public void accept(Visitor visitor);
    public void operation();
}
