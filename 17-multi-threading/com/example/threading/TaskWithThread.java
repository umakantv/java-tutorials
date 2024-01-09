package com.example.threading;

public class TaskWithThread {
    String name;
    public TaskWithThread(String name) {
        this.name = name;
    }
    public void execute() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + " " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}
