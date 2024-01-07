package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class JavaCollections {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<String>();
        words.add("Name");
        words.add("is");
        words.add("Bond");
        words.add("James Bond");
        words.add("Bond");
        
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(words.get(3)); // James Bond
        System.out.println(words.size()); // 5
        System.out.println(words.contains("Bond")); // true
        System.out.println(words.indexOf("Bond")); // 2
        System.out.println(words.remove(3)); // James Bond
        System.out.println(words.size()); // 4
        System.out.println(words.remove("Bond")); // true
        System.out.println(words.size()); // 3
        // Join words with a space
        System.out.println(String.join(" ", words)); // Name is Bond

        Collections.sort(words);
        System.out.println(String.join(" ", words)); // Bond Name is

        Collections.sort(words, Collections.reverseOrder());
        System.out.println(String.join(" ", words)); // is Name Bond

        // custom comparator
        Collections.sort(words, (String a, String b) -> {
            // return a.length() - b.length();
            return a.charAt(a.length() - 1) - b.charAt(b.length() - 1);
        });
        System.out.println(String.join(" ", words)); // is Name Bond

        // Hash map
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("James Bond", "007");

        if (map.get("James Bond") != null) {
            System.out.println(map.get("James Bond")); // 007
        }
        System.out.println(map.get("James Bondy")); // null

        
    }
    
}
