package HashTable;

public class Coppia <K,V> {
    private K key;
    private V value;
    public Coppia(K key, V value) {
        if(key==null || value==null)throw new Valore("Errore");
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

}
