package z24.t1;

public class FullNumFactory implements FullNum {
    private String Num, img;
    private int real;

    FullNumFactory(int x, int y) {
        setNum(x, y);
    }

    @Override
    public ImgFactory createImg() {
        return new ImgFactory();
    }

    @Override
    public RealFactory createReal() {
        return new RealFactory();
    }

    public String getNum() {
        return this.Num;
    }

    public void setNum(int x, int y) {
        this.img = createImg().getnum(y);
        this.real = createReal().getnum(x);
        this.Num = this.real + "+" + this.img;
    }
}