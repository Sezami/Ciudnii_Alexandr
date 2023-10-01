package homework_nr_10;


import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Jan", "Kowalski", 45, "IT"),
                new Employee("Anna", "Zawadzka", 19, "HR"),
                new Employee("Piotr", "Kowalski", 30, "Software Engineering"),
                new Employee("Katarzyna", "Borowska", 41, "Marketing"),
                new Employee("Tomasz", "Nowak", 29, "Procurement"),
                new Employee("Weronika", "Kowalska", 22, "Administration"));

        Predicate<Employee> isSoftwareEngineer = employee -> employee.department.equals("Software Engineering");
        Predicate<Employee> ageIsOver20 = employee -> employee.age > 20;
        Predicate<Employee> nameStartsWithA = employee -> employee.name.startsWith("A");

        System.out.println("--------------------------------------------------");
        testEmployee(employees, isSoftwareEngineer);
        System.out.println("--------------------------------------------------");
        testEmployee(employees, ageIsOver20);
        System.out.println("--------------------------------------------------");
        testEmployee(employees, nameStartsWithA);
        System.out.println("--------------------------------------------------");
    }

    public static void testEmployee(List<Employee> employees, Predicate<Employee> testMethod) {
        for (Employee employee : employees) {
            if (testMethod.test(employee)) {
                System.out.println(employee);
            }
        }
    }

}