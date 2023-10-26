package homework_nr_14;

public class GenericNumber<T extends Number> {
    private final T number;

    public T getNumber() {
        return number;
    }

    public GenericNumber(T number) {
        this.number = number;


    }
}
