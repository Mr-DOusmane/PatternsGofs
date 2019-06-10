package Decorator;

public class ResponsableWorker implements Employee {

    private Employee empl;

    public ResponsableWorker(Employee empl){
        this.empl = empl;
    }

    @Override
    public String getName() {
        return empl.getName();
    }

    @Override
    public String getOffice() {
        return empl.getOffice();
    }

    @Override
    public void roles() {
        empl.roles();
    }
}
