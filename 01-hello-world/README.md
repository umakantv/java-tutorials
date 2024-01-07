
# Executing the program

```bash
java HelloWorld.java
```

**First class** in the entry point of the program must have a `public static void main(String[] args)` method.

# Console Output

`System.out.println()` is used to print to the console.

# Taking Console Input

`Scanner` class is used to take input from the console.

```java
import java.util.Scanner; // Importing dependencies


Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
```
