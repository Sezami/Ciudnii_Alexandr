package homework_nr_6;

public class Date {

    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(2023);
        date.setMonth(9);
        date.setDay(24);
        date.displayDate();
    }

    private int year;
    private int month;
    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if (this.month == 2) {

            if (isLeapYear() && day > 0 && day <= 29) {
                this.day = day;

            } else if (!isLeapYear() && day > 0 && day <= 28) {
                this.day = day;

            } else {

                System.out.println("Invalid date for this month");
            }
        } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {

            if (day > 0 && day <= 30) {
                this.day = day;
            } else {

                System.out.println("Invalid date for this month");
            }
        } else {

            if (day > 0 && day <= 31) {
                this.day = day;
            } else {

                System.out.println("Invalid date for this month");
            }
        }
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        if (month >= 1 && month < 12) {
            this.month = month;

        } else
            System.out.println("Invalid month");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year >= 1) {
            this.year = year;

        } else
            System.out.println("Invalid year");
    }

    boolean isLeapYear() {
        return (this.year % 4 == 0);
    }

    public void displayDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

