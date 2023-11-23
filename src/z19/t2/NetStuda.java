package z19.t2;

public class NetStuda extends Exception {
    public NetStuda(String name) {
        super("Студент с ФИО " + name + " не найден!");
    }
}
