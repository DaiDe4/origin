package z27;

import java.util.LinkedList;

class HashTable<K, V> {
    private final LinkedList<KeyPairValueKV1<K, V>>[] table;
    private final int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void add(K key, V value) {
        int index = hashFunc(key);
        LinkedList<KeyPairValueKV1<K, V>> list = table[index];

        for (KeyPairValueKV1<K, V> pair : list) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }

        list.add(new KeyPairValueKV1<>(key, value));
    }

    public V lookup(K key) {
        int index = hashFunc(key);
        LinkedList<KeyPairValueKV1<K, V>> list = table[index];

        for (KeyPairValueKV1<K, V> pair : list) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    public void delete(K key) {
        int index = hashFunc(key);
        LinkedList<KeyPairValueKV1<K, V>> list = table[index];

        for (KeyPairValueKV1<K, V> pair : list) {
            if (pair.getKey().equals(key)) {
                list.remove(pair);
                return;
            }
        }
    }
}
