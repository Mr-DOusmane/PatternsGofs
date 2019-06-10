package Decorator;

public class MainDecorator {

    public static void main(String[] args) {

        Employee employee = new Developer("Ousmane DIAKITE");
        employee.roles();
        System.out.println("-------------------------------------------------");
        employee = new ResponsableWorker(employee);
        employee.roles();
        System.out.println("-------------------------------------------------");
        employee = new AdministrationManager(employee);
        employee.roles();
        System.out.println("-------------------------------------------------");
        employee = new WorksProject(employee, "Web application FARAD");
        employee.roles();
        System.out.println("-------------------------------------------------");
        employee = new WorksProject(employee, "web spplication ESMOVIA");
        employee.roles();
    }
}
