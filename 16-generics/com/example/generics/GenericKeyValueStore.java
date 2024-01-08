package com.example.generics;

import java.util.ArrayList;

/**
 * GenericKeyValueStore stores any type of key and value.
 */
public class GenericKeyValueStore<K, V> extends AbstractKeyStoreType<K, V> {
    ArrayList<K> keys = new ArrayList<K>();
    ArrayList<V> values = new ArrayList<V>();

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
            return;
        }
        keys.add(key);
        values.add(value);
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        return values.get(index);
    }
}
