package com.example.exceptions;

class ExceptionHandling {
    public static void main(String[] args) {

        try {
            throwRuntimeException();
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            throwException();
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            throwCustomException();
        } catch (ArithmeticException e) {

            e.printStackTrace();
        }

        System.out.println("I'm in main after all exceptions");
    }

    public static void throwException() throws Exception {
        throw new Exception("This is an exception");
    }

    public static void throwRuntimeException() {
        throw new RuntimeException("This is a runtime exception");
    }

    public static int throwCustomException() throws ArithmeticException {
        int a = 5/0;

        return a;
    }
}
