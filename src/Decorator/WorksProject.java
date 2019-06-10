package Decorator;

public class WorksProject extends ResponsableWorker {

    private String project;

    public WorksProject(Employee empl, String project) {
        super(empl);
        this.project = project;
    }

    @Override
    public void roles() {
        super.roles();
        System.out.println("I work in this moment on ths project " + this.project);
    }
}
