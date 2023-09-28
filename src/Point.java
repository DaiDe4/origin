import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Point {
    private double x;
    private double y;
    private double[] center = new double[2];

    public Point(double x, double y) {
        center[0] = x;
        center[1] = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  Arrays.toString(center);

    }

    public double[] getCenter() {
        return center;
    }
}

class Circle {
    List<Object> spisok = new ArrayList<Object>();

    private double rad;
    private Point center;

    public Circle(Point center, double rad) {
        this.center = center;
        spisok.add(center);
        this.rad = 2*3.14*rad;
        spisok.add(this.rad);
    }

    public List<Object> getSpisok() {
        return spisok;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void setSpisok(List<Point> center) {
        this.spisok = spisok;
    }

    public List<Object> retSpisok() {
        return this.spisok;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "spisok=" + spisok +
                ", rad=" + rad +
                ", center=" + center +
                '}';
    }
}

class Tester {
    public static void main(String[] args) {
        Point k2 = new Point(5, 8);
        Point k3 = new Point(4, 8);
        Circle k1 = new Circle(k2,6);
        Circle k4 = new Circle(k3,9);
        List<List> spisok = new ArrayList<List>();
        spisok.add(k1.retSpisok());
        spisok.add(k4.retSpisok());
        System.out.println(spisok);
    }
}

