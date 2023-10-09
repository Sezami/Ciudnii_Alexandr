package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {


        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        for (Integer number : numbers) {
            System.out.println(isEven.test(number));
        }
        System.out.println("--------------------------------------------------");


        Consumer<String> printLine = System.out::println;
        List<String> names = List.of("Jan", "Anna", "Piotr", "Katarzyna", "Tomasz", "Weronika");
        printLine.accept(names.toString());

        System.out.println("--------------------------------------------------");

        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        for (Integer number : numbers) {
            System.out.println(multiplyByTwo.apply(number));
        }

        System.out.println("--------------------------------------------------");

        Supplier<Integer> random = () -> (int) (Math.random() * 100);
        System.out.println(random.get());
        System.out.println("--------------------------------------------------");

    }


}






