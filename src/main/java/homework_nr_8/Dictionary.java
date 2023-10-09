package homework_nr_8;

import java.util.HashMap;

import java.util.Map;


public class Dictionary {
    public static void main(String[] args) {
        enRoDictionary();
    }

    public static void enRoDictionary() {
        Map<String, String> inputWords = new HashMap<>();
        inputWords.put("Developer", "Programator");
        inputWords.put("Teacher", "Profesor");
        inputWords.put("Driver", "Sofer");
        inputWords.put("Water", "Apa");
        inputWords.put("Flower", "Floare");
        inputWords.put("Pensil", "Pix");
        inputWords.put("Cable", "Cablu");
        inputWords.put("Table", "Masa");
        inputWords.put("Bottle", "Sticla");
        inputWords.put("Car", "Masina");

        inputWords.forEach((key, value) -> System.out.println(key + " - " + value));

    }


}


