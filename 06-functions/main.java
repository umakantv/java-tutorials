package functions;

import java.util.Arrays;

public class Main {
    // Functions are defined outside the main function
    // Functions are called from the main function

    // Functions can be called from other functions
    // Functions can be called from other classes
    // Functions can be called from other packages

    // Functions can be overloaded, overridden

    // Functions can be final, abstract, static
    // Functions can be private, protected, default, public
    // Functions can be synchronized, that is, only one thread can access it at a time

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(add(4, 5, 6, 7, 8));

        System.out.println(Arrays.toString(addAndSubtract(4, 5)));
    }

    // variable number of arguments
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static int[] addAndSubtract(int a, int b) {
        int[] result = new int[2];
        result[0] = a + b;
        result[1] = a - b;

        return result;
    }
}