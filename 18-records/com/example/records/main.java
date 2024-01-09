package com.example.records;

class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "123 Main St.");
        System.out.println(person.name());
        System.out.println(person.address());

        System.out.println(Person.UNKNOWN_ADDRESS);
        System.out.println(Person.unnamed("123 Main St."));
    }
    
}