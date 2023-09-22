public class Ball {

    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y){}

    public Ball(){}

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

    public void setXY(double x, double y){
        this.y = y;
        this.x = x;
    }
    public void move(double xDisp, double yDisp){
        this.y = yDisp;
        this.x = xDisp;
    }

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}


class TestBall{}
