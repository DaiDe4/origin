package z27;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable<String, Integer> hashst = new HashTable<>(10);

        hashst.add("key1", 5);
        hashst.add("key2", 8);

        Integer value = hashst.lookup("key1");
        if (value != null) {
            System.out.println("Значение для ключа key1: " + value);
        } else {
            System.out.println("Элемент не найден.");
        }

        hashst.delete("key2");

        value = hashst.lookup("key2");
        if (value != null) {
            System.out.println("Значение для ключа key2: " + value);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}
