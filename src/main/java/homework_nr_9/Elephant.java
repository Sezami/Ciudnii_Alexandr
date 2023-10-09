package homework_nr_9;

public class Elephant extends Herbivor implements Animal {

    @Override
    public void eat() {
        System.out.println("Elephant eats plants");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeps up to 6 hours");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant can trumpet, roar, chirp and squeak");
    }

    @Override
    public void animalLifespan() {
        System.out.println("Elephant lifespan is about 70 years");
    }


    @Override
    void behavior() {
        System.out.println("Elephant behavior unpredictable");
    }
}