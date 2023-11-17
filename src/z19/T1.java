package z19;

import java.math.BigInteger;

public class T1 {
    private BigInteger innNum;

    public T1(BigInteger inn){
        super("ИНН с номером "+ inn + " не действителен!");
        innNum = inn;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}