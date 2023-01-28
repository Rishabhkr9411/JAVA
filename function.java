
import java.util.Scanner;

class New {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String message = greet();

        System.out.println(message);
    }

    static String greet() {
        String greeting = " how are you";
        return greeting;

    }
}

class function {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;

    }

    public double circumference() {
        return perimeter();
    }
}

class Circle1 {

    public static void main(String[] args) {
        function c1 = new function();
        c1.radius = 7;
        System.out.println("Area =" + c1.area());
        System.out.println("perimeter =" + c1.perimeter());
        System.out.println("hello world");
    }
}
