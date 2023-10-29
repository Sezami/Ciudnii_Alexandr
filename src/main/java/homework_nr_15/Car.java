package homework_nr_15;


import java.util.Comparator;

public class Car implements Comparable<Car> {
    int yearMade;
    String name;

    public Car(int yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }


    @Override
    public int compareTo(Car car) {
        return Comparator.comparing((Car c1) -> c1.yearMade).reversed()
                .compare(this, car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }
}
