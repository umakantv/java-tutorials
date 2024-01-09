package com.example.threading;

class Main {

    public static void main(String[] args) throws InterruptedException {
        TaskWithThread taskWithThread = new TaskWithThread("Long Running Thread Task");
        taskWithThread.execute();

        Task task = new Task("Main Task");
        task.execute();

        /**
         * Output:
         * Main Task 0
         * Main Task 1
         * Long Running Thread Task 0
         * Main Task 2
         * Main Task 3
         * Main Task 4
         * Main Task 5
         * Main Task 6
         * Main Task 7
         * Main Task 8
         * Main Task 9
         * Long Running Thread Task 1
         * Long Running Thread Task 2
         * Long Running Thread Task 3
         * Long Running Thread Task 4
         * Long Running Thread Task 5
         * Long Running Thread Task 6
         * Long Running Thread Task 7
         * Long Running Thread Task 8
         * Long Running Thread Task 9
         */

    }
    
}