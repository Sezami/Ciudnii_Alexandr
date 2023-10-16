package homework_nr_12.CheckInteger;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        printResult(10, CheckInteger.CHECK_IF_ODD);
        printResult(21, CheckInteger.CHECK_IF_ODD);
        printResult(40, CheckInteger.CHECK_IF_EVEN);
        printResult(-200, CheckInteger.CHECK_IF_POSITIVE);
        printResult(200, CheckInteger.CHECK_IF_NEGATIVE);
        printResult(0, CheckInteger.CHECK_IF_ZERO);
        printResult(100, CheckInteger.CHECK_IF_IN_RANGE);

    }

    public static void printResult(int number, CheckInteger checkInteger) {
        System.out.println("The result of " + checkInteger + " for number " + number + " = " + checkInteger.getCheckNumber().test(number));

    }
}
