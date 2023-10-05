package homework_nr_7;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alex", "Drum", 10, "Dream Team");
        Programmer p1 = new Programmer("Daniel", "Buff", "JAVA", 10);

        m1.printMyName();
        m1.work();
        System.out.println("________________________________________________________________________________");
        p1.printMyName();
        p1.work();
        System.out.println("________________________________________________________________________________");

        ArrayList <Person> persons = new ArrayList<>(List.of(m1,p1));
        for (Person person : persons) {
            if (person instanceof Manager manager) {
                manager.work();
            }
        }
    }
}



