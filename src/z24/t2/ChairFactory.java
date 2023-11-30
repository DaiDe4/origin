package z24.t2;

public class ChairFactory implements Chair {
    @Override
    public Vict createVict() {
        return new VictorianChair();
    }

    @Override
    public Mult createMult() {
        return new MultiFuncChair();
    }

    @Override
    public Magi createMag() {
        return new MagicChair();
    }
}
