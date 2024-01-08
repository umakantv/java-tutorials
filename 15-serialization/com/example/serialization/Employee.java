package com.example.serialization;

import java.io.Serializable;
// import java.util.ArrayList;

public class Employee implements Serializable {
    
    public int id;
    public String name;
    public String email;
    public String phone;
    public String address;
    public boolean isPermanent;
    // public ArrayList<Document> documents; // Not serializable
    
    Employee(
        int id,
        String name,
        String email,
        String phone,
        String address,
        boolean isPermanent
        // ArrayList<Document> documents
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.isPermanent = isPermanent;
        // this.documents = documents;
    }
}
