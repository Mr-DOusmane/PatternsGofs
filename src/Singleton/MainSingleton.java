package Singleton;

public class MainSingleton {

    public static void main(String[] args) {

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.setName("singleton-2");

        Singleton2 singleton21 = Singleton2.getInstance();

        // now try to print the name of both singleton

        singleton2.print();
        singleton21.print(); // it is same

        // ask if pointers is equals now
        System.out.println(singleton2 == singleton21); // it is equal you get true;

        // now create a new singleton
        Singleton2 singleton22 = Singleton2.getInstance();

        // now ask if this is equal with las two
        System.out.println((singleton2 == singleton21) && (singleton2 == singleton22) && (singleton21 == singleton22)); // you got true it is same instance.
    }
}
