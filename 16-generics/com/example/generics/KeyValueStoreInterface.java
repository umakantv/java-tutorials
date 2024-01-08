package com.example.generics;

/**
 * KeyValueStoreInterface
 */
public interface KeyValueStoreInterface<K, V> {

    /**
     * This method adds a key-value pair to the store.
     */
    public void put(K key, V value);

    /**
     * This method returns the value associated with the key.
     */
    public V get(K key);
}