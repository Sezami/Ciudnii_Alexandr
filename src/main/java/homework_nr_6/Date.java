package homework_nr_6;

public class Date {

    public static void main(String[] args) {
        Date date = new Date(22,9,2023);
        date.displayDate();
    }
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        if (day >= 1 && day < daysInMonth()) {
            System.out.println(day);
        } else
            System.out.println("Invalid day");
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if (month >= 1 && month < 12) {
            System.out.println(month);
        } else
            System.out.println("Invalid month");
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year >= 1) {
            System.out.println(month);
        } else
            System.out.println("Invalid year");
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    boolean isLeapYear() {
        return (year % 4 == 0);
    }

    public int daysInMonth() {

        switch (month) {
            case 2:
                if (isLeapYear()) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }

    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
