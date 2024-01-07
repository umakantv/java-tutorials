package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays are a collection of variables of the same type
        // Arrays are fixed in size
        // Arrays are indexed starting at 0
        // Arrays are objects in Java

        // Declare an array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        // Declare and initialize an array
        int[] numbers2 = { 1, 2, 3, 4, 5 };

        // Declare and initialize an array with a for loop
        int[] numbers3 = new int[5];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i + 1;
        }

        // Declare and initialize an array with a for each loop
        int[] numbers4 = new int[5];
        int i = 0;
        for (int number : numbers4) {
            numbers4[i] = i + 1;
            i++;
        }

        // Declare and initialize an array with a fill method
        int[] numbers5 = new int[5];
        Arrays.fill(numbers5, 1);

        // Sorting, printing and searching an array
        int[] numbers7 = new int[5];
        Arrays.fill(numbers7, 1);
        numbers7[0] = 2;
        Arrays.sort(numbers7);
        System.out.println(numbers7.length);
        System.out.println(Arrays.toString(numbers7));
        System.out.println(Arrays.binarySearch(numbers7, 2));

        // Multidimensional arrays
        int[][] numbers8 = new int[2][3];
        numbers8[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers8));

        int[][] numbers9 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(numbers9));

        // Jagged arrays, arrays with different number of columns
        int[][] numbers10 = new int[2][]; // 2 rows, but columns are not defined
        numbers10[0] = new int[3];
        numbers10[1] = new int[2];
        numbers10[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers10));

        // Copying arrays
        int[] source = { 1, 2, 3, 12, 5 };
        int[] dest = new int[3];
        System.arraycopy(source, 2, dest, 1, 2); // copy from source starting at index 2, to dest starting at index 1,
                                                 // 2 elements
        System.out.println(Arrays.toString(dest));

    }
}