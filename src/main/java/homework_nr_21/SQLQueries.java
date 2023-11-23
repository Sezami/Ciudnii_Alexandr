package homework_nr_21;

public enum SQLQueries {
    INSERT_INTO_ALL_COLUMNS_QUERY ("INSERT INTO students (student_name, student_age, student_grade) VALUES (  ?, ?, ?)"),
    INSERT_INTO_NAME_QUERY("INSERT INTO students (student_name) VALUES (?)"),
    UPDATE_STUDENT_GRADE_QUERY("UPDATE students SET student_grade = ? WHERE student_id = ?"),
    DELETE_STUDENT_FROM_TABLE_QUERY("DELETE FROM students WHERE student_id = ?"),
    SELECT_ALL_COLUMNS("SELECT * FROM students");

    final String query;


    SQLQueries(String query) {
        this.query = query;

    }
}
