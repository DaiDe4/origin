import java.util.Arrays;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){}

    public double getX() {
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y = y;
    }
}
class Circle {
    private double center[] = new double[2];
    private double x;
    private double y;

    public Circle(double x, double y) {
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

    public double[] getCenter() {
        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }

    public double[] retCenter() {
        return center;
    }
}
class Tester{
    public static void main(String[] args){
        Circle k1 = new Circle(2, 5);
        System.out.println(Arrays.toString(k1.retCenter()));
    }
}
