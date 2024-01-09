package com.example.records;

import java.util.Objects;

// Records are immutable data classes that require only the type and name of fields.


public record Person(String name, String address) {

    public static String UNKNOWN_ADDRESS = "Unknown";

    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    public Person(String name) {
        this(name, "Unknown");
    }

    /*
     * Error:
     * Duplicate method Person(String, String) in type Person
     * 
     * Since public Person(String name, String address) 
     * is already defined in the record with public Person
     */
    // public Person(String name, String address) {
    //     this.name = name;
    //     this.address = address;
    // }

    // static methods using the same syntax as static variable that returns a new Person
    public static Person unnamed(String address) {
        return new Person("Unnamed", address);
    }
}

// Very similar to be able to define an interface with variable number of arguments