package Composite;

public class Maincomposite {

    public static void main(String[] args) throws ComponentException {

        Component computer = new Composite("Computer");
        computer.setDescription("I'm an computer, i have more parts.");

        Component mouse = new Leaf("Mouse");
        mouse.setDescription("i'm an mouse, one single part of an computer");
        computer.add(mouse);

        Component uc = new Composite("Central unity");
        uc.setDescription("i'm central unity, i have some part");

        Component cm = new Composite("Scheda madre");
        cm.setDescription("Sono la scheda madre, sono composto da altre parte.");

        cm.add(new Leaf("scheda video"));
        cm.add(new Leaf("ram"));
        cm.add(new Leaf("scheda grafica"));

        uc.add(cm);
        uc.add(new Leaf("transformer"));

        computer.add(cm);
        computer.add(uc);
        computer.add(new Leaf("Key Board"));

        mouse.describe();
        System.out.println("-------------------------------");
        uc.describe();
        System.out.println("-------------------------------");
        cm.describe();
        System.out.println("-------------------------------");
        computer.describe();

        uc.remove(cm);

        System.out.println("-------------------------------");
        uc.describe();
    }
}
