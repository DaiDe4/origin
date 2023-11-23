package z19.t1;

import java.math.BigInteger;

public class InnNotGood extends Exception {
    private final BigInteger innNum;

    public InnNotGood(BigInteger inn) {
        super("ИНН с номером " + inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
