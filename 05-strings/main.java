package strings;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Strings are
        // - immutable
        // - zero indexed
        // - objects in Java
        // - stored in the String Pool
        // - compared with .equals() method
        // - compared with == operator
        // - compared with .compareTo() method
        // - concatenated with + operator
        // - concatenated with .concat() method
        // - concatenated with .join() method
        // - concatenated with .format() method
        // - concatenated with StringBuilder
        // - concatenated with StringBuffer
        // - concatenated with StringJoiner

        // Declare a string
        String name = "John Doe";

        System.out.println(name);
        
        name = "Jane Doe";
        System.out.println(name);

        // Declare and initialize a string
        String name2 = new String("John Doe");

        int result = name2.compareTo(name); // Difference in ASCII value of first unmatched character
        System.out.println("Diff " + result);
        System.out.println("Check similar " + (name == name2));
        System.out.println("Check similar with equals " + (name.equals(name2)));
        // Char at
        System.out.println("Char At Position " + new String("Another Love Another Love").charAt(2));
        // System.out.println("Char At Position " + new String("Another Love Another Love")[2]); error

        // endsWith
        System.out.println("Ends With " + new String("Another Love Another Love").endsWith("Love"));

        // startsWith
        System.out.println("Starts With " + new String("Another Love Another Love").startsWith("Another"));

        // indexOf
        System.out.println("Index Of " + new String("Another Love Another Love").indexOf("Love"));
        System.out.println("Index Of " + new String("Another Love Another Love").indexOf("Love", 9));

        System.out.println("Length " + name2.length());
        System.out.println("Substring " + name2.substring(2));
        System.out.println("Substring " + name2.substring(2, 6));

        System.out.println("Upper Case " + name2.toUpperCase());
        System.out.println("Lower Case " + name2.toLowerCase());
        // Replace all occurrences of a character
        System.out.println("Replace " + new String("Another Love Another Love").replace('A', 'a'));
        // Contains a sequence of characters
        System.out.println("Contains " + new String("Another Love Another Love").contains("Love"));

        name = name.concat(" is a great person.");
        System.out.println(name);

        // Declare and initialize a string with a char array
        char[] name3 = { 'J', 'o', 'h', 'n', ' ', 'D', 'o', 'e' };
        String name4 = new String(name3);

        // Declare and initialize a string with a byte array
        byte[] name5 = { 74, 111, 104, 110, 32, 68, 111, 101 };
        String name6 = new String(name5);

        // Declare and initialize a string with a StringBuilder
        StringBuilder name7 = new StringBuilder();
        name7.append("John");
        name7.append(" ");
        name7.append("Doe");
        String name8 = name7.toString();

        // Declare and initialize a string with a StringBuffer
        // StringBuffer is thread safe - as it is synchronized, 
        // which means that two threads can't call the methods of StringBuffer simultaneously
        // but it is slower than StringBuilder as there is an overhead of synchronization.
        StringBuffer name9 = new StringBuffer();
        name9.append("John");
        name9.append(" ");
        name9.append("Doe");
        // Insert at a specific index
        name9.insert(0, "Mr. "); // Mr. John Doe
        // Delete at a specific index
        name9.delete(0, 4); // John Doe
        // Delete a specific character
        name9.deleteCharAt(0); // ohn Doe
        // Reverse the string
        name9.reverse(); // eoD nho
        // StringBuffer supports method chaining
        System.out.println(name9.reverse().insert(0, "J").toString());
        System.out.println("Capacity " + name9.capacity());
        name9.append("is a good person.");
        System.out.println("Updated Capacity " + name9.capacity()); // 34 = (16 * 2) + 2
        name9.append("is a good person.");
        System.out.println("Updated Capacity " + name9.capacity()); // 70 = (34 * 2) + 2


        // Declare and initialize a string with a StringJoiner
        StringJoiner name11 = new StringJoiner(" ");
        name11.add("John");
        name11.add("Doe");
        String name12 = name11.toString();
        
    }
}