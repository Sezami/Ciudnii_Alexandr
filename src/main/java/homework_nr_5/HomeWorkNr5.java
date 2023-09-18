package homework_nr_5;


import java.util.Arrays;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        //Создайте массив типа int с именем numbers и количество элементов 100
        int[] numbers = new int[100];

        //заполните его числами от 100 до 0
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i;
            System.out.println(numbers[i]);
        }
        //Используя массив numbers определите сумму четных элементов и произведение нечетных элементов и выведите эти результаты на экран
        double evenSumm = 0;
        double oddProduct = 1;

        for (int number = 0; number < numbers.length; number++) {
            if (number % 2 == 0) {
                evenSumm += number;
                System.out.println("Summ of even numbers is: " + evenSumm);
            } else {
                oddProduct *= number;
                System.out.println("Product of odd numbers is: " + oddProduct);
            }
            System.out.println("Total summ of even numbers is: " + evenSumm);
            System.out.println("Total product of odd numbers is: " + oddProduct);

        }

        //Создайте массив типа int с именем copyNumbers и скопируйте все элементы из массива numbers в copyNumbers
        // решение используя цикл for
        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
            System.out.println("Copy numbers of array numbers is: " + copyNumbers[i]);
        }

        // решение используя метод System.arraycopy();
        int[] copyNumbers1 = new int[numbers.length];
        System.arraycopy(numbers, 0, copyNumbers1, 0, 100);
        System.out.println("Copy numbers1 of array numbers is: " + Arrays.toString(copyNumbers1));


    }
}







