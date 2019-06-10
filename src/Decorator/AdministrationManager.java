package Decorator;

public class AdministrationManager extends ResponsableWorker{

    public AdministrationManager(Employee empl) {
        super(empl);
    }

    @Override
    public void roles() {
        super.roles();
        System.out.println("i'm a Boss in this area : " + super.getOffice());
    }
}
