package ra.generic;

//Object: Key - Value (Study - Học)
//K,V: generic
public class Dictionary<K, V> {
    private K key;
    private V value;

    public Dictionary() {
    }

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
