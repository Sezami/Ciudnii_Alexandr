package homework_nr_7;

public abstract class Employee extends Person {

    String companyName;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public abstract void work();

}
