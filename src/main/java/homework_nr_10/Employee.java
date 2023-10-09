package homework_nr_10;


public class Employee {
    String name;
    String surname;
    int age;
    String department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String toString() {
        return "Employee " +
                "name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", department: " + department;
    }


}





