package com.example.generics;

class Main {
    public static void main(String[] args) {

        // With non-generic class, we can't specify the type of the key
        KeyValueStore johnData = new KeyValueStore();
        johnData.put("id", 10);
        johnData.put("name", "John Doe");
        johnData.put("gender", Gender.MALE);
        johnData.put("age", 30);
        johnData.put("address", "123 Main St");

        System.out.println("Id: " + johnData.get("id"));


        // With the generic class, we can specify the type of the key
        GenericKeyValueStore<String, Object> janeData = new GenericKeyValueStore<String, Object>();
        janeData.put("id", 20);
        janeData.put("name", "Jane Doe");
        janeData.put("gender", Gender.FEMALE);
        janeData.put("age", 25);
        janeData.put("address", "123 Baker St");

        System.out.println("Id: " + janeData.get("id"));


        // Create a new instance of the generic class
        // and specify the type of the generic parameter
        // as String
        GenericKeyValueStore<Integer, AbstractKeyStoreType<String, Object>> employees = new GenericKeyValueStore<Integer, AbstractKeyStoreType<String, Object>>();
        employees.put(10, johnData);
        employees.put(20, janeData);


        AbstractKeyStoreType<String, Object> possibleJohnData = employees.get(10); // Cast to KeyValueStore
        if (possibleJohnData != null) {
            System.out.println("Address: " + possibleJohnData.get("address"));
        }

        AbstractKeyStoreType<String, Object> possibleJaneData = employees.get(20); // Cast to GenericKeyValueStore
        if (possibleJaneData != null) {
            System.out.println("Address: " + possibleJaneData.get("address"));
        }
    }
    
}
