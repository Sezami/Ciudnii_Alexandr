package homework_nr_7;



public class Manager extends Employee {

    int teamSize;
    String teamName;

    public Manager(String name, String surname, int teamSize, String teamName) {
        super(name, surname);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void printMyName() {
        System.out.println("Manager's name is: " + name + " " + surname);
    }
    @Override
    public void work() {
        System.out.println("Manager administers a team consisting of: " + teamSize + " people" + "\n" + "The team name is: " + teamName);
    }

}
