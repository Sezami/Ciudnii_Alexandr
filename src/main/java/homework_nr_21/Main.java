package homework_nr_21;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String connectionString = "jdbc:postgresql://localhost:5432/test_connection_db";


    public static void main(String[] args) {
        connectDataBase();
        insertANewStudentIntoTheTable();
        updateStudentGrade();
        deleteStudentFromTable();
        displayAllStudents();
    }

    public static void connectDataBase() {
        try (Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")) {
            System.out.println("Connection successful");

        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();

        }

    }

    public static void insertANewStudentIntoTheTable() {
        try (Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student age: ");
            int age = scanner.nextInt();
            System.out.println("Enter student grade: ");
            int grade = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.INSERT_INTO_ALL_COLUMNS_QUERY.query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, grade);
            preparedStatement.execute();
            System.out.println("Student inserted successfully");
        } catch (SQLException e) {
            System.out.println("Student insertion failed");
            e.printStackTrace();
        }
    }

    public static void updateStudentGrade() {
        try (Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student id: ");
            int id = scanner.nextInt();
            System.out.println("Enter new grade: ");
            int newGrade = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.UPDATE_STUDENT_GRADE_QUERY.query);
            preparedStatement.setInt(1, newGrade);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            System.out.println("Student grade updated successfully");
        } catch (SQLException e) {
            System.out.println("Student grade update failed");
            e.printStackTrace();

        }
    }

    public static void deleteStudentFromTable() {
        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student id: ");
            int id = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.DELETE_STUDENT_FROM_TABLE_QUERY.query);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            System.out.println("Student deleted successfully");
        } catch (SQLException e) {
            System.out.println("Student deletion failed");
            e.printStackTrace();
        }
    }

    public static void displayAllStudents() {
        try(Connection connection = DriverManager.getConnection(connectionString, "postgres", "postgres")) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.SELECT_ALL_COLUMNS.query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int age = resultSet.getInt("student_age");
                int grade = resultSet.getInt("student_grade");

                System.out.print("|| Student ID: " + id +" || ");
                System.out.print("Name: " + name +" || ");
                System.out.print("Age: " + age +" || ");
                System.out.print("Grade: " + grade +" || ");
                System.out.println();
            }

            System.out.println("All students displayed successfully");
        } catch (SQLException e) {
            System.out.println("All students display failed");
            e.printStackTrace();
        }
    }

}

