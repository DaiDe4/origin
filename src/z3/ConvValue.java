package z3;

public class ConvValue {
    public double Value;

    public double getValue() {
        return Value;
    }
    public void setValue(double value) {
        Value = value;
    }
    public void rublToIen(){
        double rez = Value*1.6;
        System.out.println(rez);
    }
}
