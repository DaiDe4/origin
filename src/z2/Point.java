package z2;

import java.io.PrintStream;

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
}
class Mut{
    public static void main(String[] args) {
        Point point1 = new Point(2.0, 6.0);
        Circle circle1 = new Circle(point1, 3.0);
        Point point2 = new Point(4.0, 8.0);
        Circle circle2 = new Circle(point2, 9.0);
        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.printCircles();
    }
}