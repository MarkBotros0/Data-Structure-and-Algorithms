package hashTable;

import java.util.LinkedList;

public class MyHashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private final LinkedList<Entry<K, V>>[] table;
    private int size;

    public MyHashTable() {
        table = new LinkedList[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }
    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = this.getIndex(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        int index = this.getIndex(key);
        LinkedList<Entry<K, V>> list = table[index];
        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = getIndex(key);
        LinkedList<Entry<K, V>> list = table[index];
        if (list != null) {
            for (Entry<K, V> entry : list) {
                if (entry.getKey().equals(key)) {
                    list.remove(entry);
                    size--;
                    break;
                }
            }
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public static void testHashTable() {
        MyHashTable<Integer,String> map = new MyHashTable<>();
        map.put(3, "hello");
        map.put(2, "raw");
        map.put(1, "bold");
        System.out.println(map.get(3));
        System.out.println(map.get(2));
        System.out.println(map.get(1));
        System.out.println(map.get(0));
    }
}
