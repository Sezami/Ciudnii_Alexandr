package homework_nr_9;

public interface Animal {
    String HABITAT = "Earth";
    int MAXAGE = 100;


    void eat();

    void sleep();

    void makeSound();

    default void animalLifespan() {
        System.out.println("Animal lifespan is about: " + MAXAGE);
    }

    static void info() {
        System.out.println("All animals live on: " + HABITAT);
    }
}

