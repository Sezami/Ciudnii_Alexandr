package homework_nr_12.CheckInteger;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((number) -> number % 2 != 0),

    CHECK_IF_EVEN((number) -> number % 2 == 0),
    CHECK_IF_POSITIVE((number) -> number > 0),
    CHECK_IF_NEGATIVE((number) -> number < 0),
    CHECK_IF_ZERO((number) -> number == 0),
    CHECK_IF_IN_RANGE((number) -> number >= 0 && number <= 100);

    private final Predicate<Integer> checkNumber;


    CheckInteger(Predicate<Integer> checkNumber) {
        this.checkNumber = checkNumber;


    }

    public Predicate<Integer> getCheckNumber() {
        return checkNumber;
    }
}
