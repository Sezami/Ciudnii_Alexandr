package homework_nr_7;

public abstract class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void printMyName();

    }



