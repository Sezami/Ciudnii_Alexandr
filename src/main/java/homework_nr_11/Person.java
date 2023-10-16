package homework_nr_11;


import java.util.ArrayList;
import java.util.List;


public class Person {
    String name;
    String surname;
    int age;
    boolean isPayedByHour;

    public Person(String name, String surname, int age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;


    }

    public static void main(String[] args) {
        Person person1 = new Person("Alex", "Drum", 25, true);
        Person person2 = new Person("Boris", "Brown", 30, false);
        Person person3 = new Person("Jane", "Jones", 37, true);
        Person person4 = new Person("Michael", "Marsh", 21, false);
        Person person5 = new Person("Ivan", "Ido", 50, false);
        Person person6 = new Person("Eugen", "Essen", 46, true);
        Person person7 = new Person("Amir", "Ali", 38, false);
        Person person8 = new Person("Iren", "Joly", 52, true);
        Person person9 = new Person("Tatiana", "Tereza", 29, false);
        Person person10 = new Person("Anastasia", "Volkov", 33, true);


        List<Person> persons = new ArrayList<>(List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10));

// Persons with age > 25 and isPayedByHour = true
        List<Person> personsWithAgeOver25YearsAndIsPayedByHour = persons.stream()
                .filter(person -> person.age > 25 && person.isPayedByHour)
                .toList();
        personsWithAgeOver25YearsAndIsPayedByHour.forEach(person -> System.out.println("Persons with age > 25 and isPayedByHour: " + person.name + " " + person.surname));

        System.out.println("_____________________________________________________________");

// Persons with age > 30 and Surname starts with A
        List<Person> personsWithAgeOver30YearsAndSurnameStartsWithA = persons.stream()
                .filter(person -> person.age > 30 && person.surname.startsWith("A"))
                .toList();
        personsWithAgeOver30YearsAndSurnameStartsWithA.forEach(person -> System.out.println("Persons with age > 30 and Surname starts with A: " + person.name + " " + person.surname));

        System.out.println("_____________________________________________________________");
// First person from list with age == 37
        Person age37 = persons.stream()
                .filter(person -> person.age == 37)
                .findFirst()
                .orElse(new Person("Unknown", "Unknown", 0, false));
        System.out.println("Person with age of 37 Years: " + age37.name + " " + age37.surname);
        System.out.println("_____________________________________________________________");

    }
}
