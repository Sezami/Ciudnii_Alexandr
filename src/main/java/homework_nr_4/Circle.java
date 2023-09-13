package homework_nr_4;

public class Circle {
    double radius;

    public Circle (double radius){
        this.radius = radius;
    }

        public void calculateArea(){
        double Pi = 3.14;
        double area = Pi * (radius * radius);
            System.out.println("The area of circle is equal to: " + area);

        }
    public static void main(String[] args) {
Circle circle = new Circle(10);
circle.calculateArea();

    }
    }

