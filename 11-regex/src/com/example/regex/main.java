package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularExpression {
    public static void main(String[] args) {

        // Pattern p = Pattern.compile("a{4}\\w{2}\\d{1}"); // aaaa\w\w\d
        Pattern p = Pattern.compile("love"); // aaaa\w\w\d
        String inputString = "Another love, another love";
        Matcher matcher = p.matcher(inputString);

        while (matcher.find()) {
            System.out.println("Found match at: " + matcher.start() + " to " + matcher.end());
            System.out.println(inputString.substring(matcher.start(), matcher.end()));
        }

        System.out.println("Email validation " + isValidEmail("balleballe@balle.balle"));
    }

    static boolean isValidEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = p.matcher(email);
        return matcher.matches();
    }
}
