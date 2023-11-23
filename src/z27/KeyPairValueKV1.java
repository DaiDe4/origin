package z27;

class KeyPairValueKV1<K, V> {
    private final K key;
    private V value;

    public KeyPairValueKV1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

