package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        int month = 12;
// switch-case который будет принимать в качестве переменной int от 0 до 12 и в зависимости от числа отобразить на экран месяц в году.
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");

        }

        // цикл который отображает в консоль все числа от 100 до 1000 которые делятся на 5 с использованием while loop

        int num = 100;
        while (num <= 1000) {
            if (num % 5 == 0) {
                System.out.println("A number in the range from 100 to 1000 that is divisible by 5 without a remainder is " + num);
            }
            num++;
        }
// цикл который отображает в консоль все числа от 100 до 1000 которые делятся на 5 с использованием for loop
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println("A number in the range from 100 to 1000 that is divisible by 5 without a remainder is " + i);
            }

        }
        //цикл(ы) который(е) отображает(ют) в консоль сумму следующей серии: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
        double sum = 0;
        for (double i = 1; i <= 97; i += 2) {
            sum += i / (i+2);
            System.out.println("Sum is: " + sum);



            }

        }

    }





