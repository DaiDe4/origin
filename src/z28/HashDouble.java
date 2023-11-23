package z28;

import java.util.HashMap;

public class HashDouble {
    public static void main(String[] args) {
        HashMap<Double, String> HashDouble = new HashMap<>();

        HashDouble.put(3.5, "значение1");
        HashDouble.put(1.1, "значение2");
        HashDouble.put(5.2, "значение3");

        String value = HashDouble.get(2.8);
        System.out.println("Значение для ключа 2.8: " + value);
    }
}

