package homework_nr_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TasksList {
    public static void main(String[] args) {

        listOfTasksForToday();

        List<String> values = new ArrayList<>();
        values.add("Suzuki");
        values.add("Toyota");
        values.add("Nissan");
        values.add("Mercedes");
        values.add("Audi");
        values.add("Suzuki");
        values.add("Toyota");
        values.add("Nissan");
        values.add("Mercedes");
        values.add("Audi");

        Set<String> uniqueValues = getUniqueValues(values);
    }

    public static List<String> listOfTasksForToday() {
        List<String> tasks = new ArrayList<>();
        tasks.add("To do homework");
        tasks.add("To buy food");
        tasks.add("To prepare presentation");
        tasks.add("To read the book");
        for (String element : tasks) {
            System.out.println(element);
        }
        return tasks;
    }

    public static Set<String> getUniqueValues(List<String> inputList) {
        Set<String> uniqueValues = new HashSet<>();
        uniqueValues.addAll(inputList);
        System.out.println(uniqueValues);

        return uniqueValues;
    }

}
