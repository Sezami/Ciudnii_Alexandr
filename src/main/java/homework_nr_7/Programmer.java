package homework_nr_7;

public class Programmer extends Employee{
    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String name, String surname, String programmingLanguage, int yearsOfExperience) {
        super(name, surname);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printMyName() {
        System.out.println("Programmer name is: " + name + " " + surname);
    }

    @Override
    public void work() {
        System.out.println("Programmer develops applications in a programming language: " + programmingLanguage + "\n" + "Programmer has experience: " + yearsOfExperience + " years");
    }
}
