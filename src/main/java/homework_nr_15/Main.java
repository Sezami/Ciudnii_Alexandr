package homework_nr_15;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2016, "BMW");
        Car car2 = new Car(2022, "Mercedes");
        Car car3 = new Car(2019, "Audi");
        Car car4 = new Car(2017, "Toyota");
        Car car5 = new Car(2015, "Nissan");

        Set<Car> carsSet = new HashSet<>(Set.of(car1, car2, car3, car4, car5));


        carsSet.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("_____________________________");
        Set<Car> carsTreeSet = new TreeSet<>(Set.of(car1, car2, car3, car4, car5));

        carsTreeSet.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("_____________________________");

        carsTreeSet.stream()
                .sorted(Comparator.comparing((Car c1) -> c1.name))
                .forEach(System.out::println);
    }
}
