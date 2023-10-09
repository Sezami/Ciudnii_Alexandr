package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.animalLifespan();
        System.out.println("_________________________________________________");
        Herbivor elephant1 = new Elephant();
        elephant1.behavior();
        elephant1.rest();

        Animal.info();


    }
}
