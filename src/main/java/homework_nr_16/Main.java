package homework_nr_16;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Path inputPath = Paths.get("src/main/java/homework_nr_16/input.txt");
        Path outputPath = Paths.get("src/main/java/homework_nr_16/Output.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath, Charset.defaultCharset());
            if (lines.isEmpty()) {
                System.out.println("Lack of names in input file.");
                return;
            }
            List<String> names = new ArrayList<>();
            List<Integer> ages = new ArrayList<>();
            List<Double> scores = new ArrayList<>();
            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    names.add(parts[0].trim());
                    ages.add(Integer.parseInt(parts[1].trim()));
                    scores.add(Double.parseDouble(parts[2].trim()));
                } else {
                    System.err.println("Wrong format: " + line);
                }
            }
            double averageScore = calculateAverageScore(scores);
            int youngestIndex = findYoungestIndex(ages);
            int oldestIndex = findOldestIndex(ages);

            List<String> results = new ArrayList<>();
            results.add("Средний балл: " + averageScore);
            results.add("Самый молодой человек: " + names.get(youngestIndex) + " (возраст: " + ages.get(youngestIndex) + ")");
            results.add("Самый старший человек: " + names.get(oldestIndex) + " (возраст: " + ages.get(oldestIndex) + ")");

            Files.write(outputPath, results);
            System.out.println("The results have been written to 'output.txt'.");
        } catch (IOException e) {
            System.err.println("Input/Output error: " + e.getMessage());
        }
    }


    static double calculateAverageScore(List<Double> scores) {
        double totalScore = 0.0;
        for (Double score : scores) {
            totalScore += score;
        }
        return totalScore / scores.size();
    }


    static int findYoungestIndex(List<Integer> ages) {
        int youngestIndex = 0;
        int minAge = ages.get(0);
        for (int i = 1; i < ages.size(); i++) {
            if (ages.get(i) < minAge) {
                minAge = ages.get(i);
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }


    static int findOldestIndex(List<Integer> ages) {
        int oldestIndex = 0;
        int maxAge = ages.get(0);
        for (int i = 1; i < ages.size(); i++) {
            if (ages.get(i) > maxAge) {
                maxAge = ages.get(i);
                oldestIndex = i;
            }
        }
        return oldestIndex;
    }


}







