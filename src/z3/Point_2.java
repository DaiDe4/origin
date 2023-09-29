package z3;

import java.util.Arrays;
import java.util.Random;

public class Point_2 {
}
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return this.center;
    }
    public double getRadius() {
        return this.radius;
    }
}

class Tester {
    private Circle[] circles;
    private int number;

    public Tester(int kol) {
        this.circles = new Circle[kol];
        this.number = 0;
    }

    public void addCircle(Circle circle) {
        this.circles[this.number] = circle;
        ++this.number;
    }
    public void printCircles() {
        for(int i = 0; i < this.number; ++i) {
            System.out.println("Окружность " + (i + 1));
            System.out.println("Центр: " + this.circles[i].getCenter().getX() + ", " + this.circles[i].getCenter().getY());
            Circle var2 = this.circles[i];
            System.out.println("Радиус:" + var2.getRadius());
            System.out.println();
        }
    }
    public Circle dalSmalC() {
        Circle smC = this.circles[0];
        for(int i = 1; i < this.number; ++i) {
            if (this.circles[i].getRadius() < smC.getRadius()) {
                smC = this.circles[i];
            }
        }
        return smC;
    }

    public Circle dalBigC() {
        Circle bigC = this.circles[0];
        for(int i = 1; i < this.number; ++i) {
            if (this.circles[i].getRadius() > bigC.getRadius()) {
                bigC = this.circles[i];
            }
        }
        return bigC;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", number=" + number +
                '}';
    }
}
class Mut{
    public static void main(String[] args) {
        Random random = new Random();

        double x = random.nextInt(90) + 10;
        double y = random.nextInt(90) + 10;
        double radius = random.nextInt(90) + 10;

        Point center1 = new Point(x, y);
        Circle circle1 = new Circle(center1, radius);

        x = random.nextInt(90) + 10;
        y = random.nextInt(90) + 10;

        radius = random.nextInt(90) + 10;
        Point center2 = new Point(x, y);
        Circle circle2 = new Circle(center2, radius);

        Tester tester = new Tester(2);

        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.printCircles();

        System.out.println("Меньшая окружность:");
        System.out.println(tester.dalSmalC());
        System.out.println("Большая окружность:");
        System.out.println(tester.dalBigC());
    }
}
