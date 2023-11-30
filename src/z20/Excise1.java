package z20;


public class Excise1<T extends String, V extends Animal, K> {
    private final T obT;
    private final V obV;
    private final K obK;

    public Excise1(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public void ShowTypes() {
        System.out.println("Тип T: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());
        System.out.println("Тип K: " + obK.getClass().getName());
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }
}
