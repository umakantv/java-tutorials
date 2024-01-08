package com.example.files_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

class FileHandling {

    final static String DictionaryFilePath = "/usr/share/dict/words";

    public static void main(String[] args) {

        System.out.println(new Date());

        ArrayList<String> words = readFile(DictionaryFilePath);

        writeWordsToFile(words, "output.txt");

        System.out.println(new Date());
    }

    public static ArrayList<String> readFile(String filePath) {

        ArrayList<String> words = new ArrayList<String>();

        try {

            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(filePath),
                    StandardCharsets.UTF_8
                )
            );
            String line = br.readLine();

            while (line != null) {
                words.add(line);
                line = br.readLine();
            }
            br.close();

            System.out.println("Total words : " + words.size());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return words;
    }

    public static void writeWordsToFile(ArrayList<String> words, String filePath) {
        try {
            File file = new File(filePath);
            BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream(file, false),
                    StandardCharsets.UTF_8
                )
            );

            Random rand = new Random();

            // 1 GB =  1073741824 bytes
            // 100 MB = 104857600 bytes
            final int charCount = 1073741824; // 1 GB
            int size = 0; // counterForGarbageCollection = 0;
            String word = "";

            // Get random words from the dictionary
            while (size < charCount) {
                word = words.get(rand.nextInt(words.size()));
                size += word.length();

                bw.write(word + " ");
                // System.out.println(word);
                // fileStream.write((word + " ").getBytes());

                // if (size > counterForGarbageCollection * (charCount / 10)) { // wait 10 times
                //     System.out.println("Waiting for Garbage Collection: " + counterForGarbageCollection);
                //     counterForGarbageCollection++;
                //     Thread.sleep(1000);
                // }
            }

            bw.flush(); // flush the buffer, so that all data written to the stream is written to its destination
            bw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
