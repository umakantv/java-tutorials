
# Variables in Java

Types of variables in Java:

- Local variables
- Instance variables
- Static variables


## Local Variables

- A variable declared inside the body of the method is called a local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
- A local variable cannot be defined with "static" keyword.
- A local variable is created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.
- Access modifiers cannot be used for local variables.


## Instance Variables

- Instance variables are declared in a class, but outside a method, constructor or any block.
- When a space is allocated for an object in the heap, a slot for each instance variable value is created.


## Static Variables

- A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.
- Static variables are also known as Class Variables.
- A static variable can be accessed directly by the class name and doesn't need any object.
- Syntax: `static data_type variable_name;`
- Example: `static int num;`
- Static variables are initialized only once, at the start of the execution. These variables will be initialized first, before the initialization of any instance variables.

## Example

```java
public class Test {
    // Static variable
    static int a = 10;

    // Instance variable
    int b = 20;

    void method() {
        // Local variable
        int c = 30;
    }
}
```