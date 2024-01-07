package variables;

public class Main {

    public static void main(String[] args) {
        // 1. Declare a variable of type int with a value of 113
        int num = 113;
        // 2. Declare a variable of type double with a value of 2.71828
        double num2 = 2.71828;
        // 3. Declare a variable of type String with a value of "Computer Science"
        String str = "Computer Science";
        // 4. Declare a variable of type String with a value of "CS rocks!"
        String str2 = "CS rocks!";
        // 5. Print out the values of each variable on a new line
        System.out.println(num);
        System.out.println(num2);
        System.out.println(str);
        System.out.println(str2);
        // 6. Use concatenation to print out the values of each variable on a new line in this format:
        //    113 is the answer to life, the universe, and everything.
        //    2.71828 is a decent approximation of e.
        //    Computer Science is the best, the greatest, and the most wonderful subject to study!
        //    CS rocks!
        System.out.println(num + " is the answer to life, the universe, and everything.");
        System.out.println(num2 + " is a decent approximation of e.");
        System.out.println(str + " is the best, the greatest, and the most wonderful subject to study!");
        System.out.println(str2);

        // Then there is whole bunch of information about the different types of variables
        // and how to use them. I'm not going to copy that here, because it's not really
        // necessary. I'll just copy the code examples.
    
        // Also the type conversion stuff is there, but I'm not going to copy that either.
        // It's pretty straightforward.
        Integer a = Integer.parseInt("10"); // returns 10
        String s = a.toString(); // error - cannot invoke toString() on the primitive type int
        System.out.println(s);

        a = Integer.valueOf("10"); // returns 10
        System.out.println(a);

    
        // defining constants
        final int MAX = 100;
    
        // MAX = 200; // error - cannot assign a value to final variable MAX
        
    }

}