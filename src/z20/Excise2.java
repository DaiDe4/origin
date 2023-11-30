package z20;

public class Excise2 {
    public static void main(String[] args) {
        Excise1<String, Cat, Float> Excise1 = new Excise1<>("Cobbarge", new Cat(), 79.6f);

        Excise1.ShowTypes();
        System.out.println("Значение T: " + Excise1.getObT());
        System.out.println("Значение V: " + Excise1.getObV());
        System.out.println("Значение K: " + Excise1.getObK());
    }
}
