package com.example.generics;

import java.util.ArrayList;

/**
 * This class is a simple key-value store.
 * It stores keys of type String and values of type Object.
 * 
 * This class is not generic.
 * It can only store keys of type String.
 * 
 * Let's say we want the same functionality but with a different type of key.
 * We can't set an integer as the key at compile time.
 * We will have to define a new class for that.
 */
public class KeyValueStore extends AbstractKeyStoreType<String, Object> {
    ArrayList<String> keys = new ArrayList<String>();
    ArrayList<Object> values = new ArrayList<Object>();


    /**
     * This method adds a key-value pair to the store.
     */
    public void put(String key, Object value) {
        int index = keys.indexOf(key);
        if (index != -1) {
            values.set(index, value);
            return;
        }
        keys.add(key);
        values.add(value);
    }

    public Object get(String key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        return values.get(index);
    }
}