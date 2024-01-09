package com.example.threading;

public class Task {
    String name;
    public Task(String name) {
        this.name = name;
    }
    public void execute() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
        }
    }
}
