package com.example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class SerializationDemo {

    public static void main(String[] args) {

        SerializationDemo demo = new SerializationDemo();
        // demo.serialize();
        demo.deserealize();
        
    }

    public void serialize() {

        // Serialization
        Employee emp = new Employee(
            1,
            "Peter",
            "peter.thiel@example.com",
            "+1-202-555-0175",
            "1234 Main St, San Francisco, CA 94123",
            true
        );

        System.out.println("Serializing employee...");

        try {
            FileOutputStream fileOut = new FileOutputStream("assets/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp); // export object to file, could through runtime error if not serializable
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    public void deserealize() {
        // Deserialization
        Employee emp = null;

        System.out.println("Deserializing employee...");

        try {
            FileInputStream fileIn = new FileInputStream("assets/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            emp = (Employee) in.readObject(); // Cast to Employee
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Deserialized employee:");
        System.out.println("id: " + emp.id);
        System.out.println("name: " + emp.name);
        System.out.println("email: " + emp.email);
        System.out.println("phone: " + emp.phone);
        System.out.println("address: " + emp.address);
        System.out.println("isPermanent: " + emp.isPermanent);
        // System.out.println("documents: " + emp.documents);

        // For fun, let's skip a few fields at the time of serialization
        // and see what happens when we deserialize
        // java.io.InvalidClassException: com.example.serialization.Employee; local class incompatible: 
        // stream classdesc serialVersionUID = -8814690586782067656, local class serialVersionUID = -4586983063227223571

    }

    // Skipped ArrayList<Document> documents as it is not serializable
    public ArrayList<Document> getDocuments() {
        ArrayList<Document> documents = new ArrayList<Document>();
        documents.add(new Document("govt_id", "My government ID"));
        documents.add(new Document("acceptance_letter", "My job acceptance letter"));
        documents.add(new Document("total_compensation_letter", "$45000"));
        return documents;
    }
    
}
