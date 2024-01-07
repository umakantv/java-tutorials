package oops;

/**
 * Object Oriented Programming
 * 
 * In OOPS, Classes are used to model state and behavior of real world entities.
 * 
 * They hide away the implementation details and expose only the functionality, that is encapsulation.
 * They also provide a way to reuse code, that is inheritance.
 * They also provide a way to change the behavior of a method in child class, that is polymorphism.
 * They also provide a way to hide the implementation details of a method, that is abstraction.
 */
public class Main {
    public static void main(String[] args) {
        // encapsulation();
        abstraction();
        // polymorphism();
        // inheritance();
    }

    // Encapsulation is a process of wrapping code and data together into a single unit.
    // It is used to hide the values or state of a structured data object inside a class,
    // preventing unauthorized parties' direct access to them.
    // It also make code more maintainable, as we can change the implementation without affecting the usage.
    public static void encapsulation() {
        Employee employee = new Employee(1, 1000);
        System.out.println(employee.getSalary());
    }

    /*
     * Abstraction is a process of hiding the implementation details and showing
     * only functionality to the user.
     * 
     * For example, we know each shape has a method getArea(), 
     * but we don't know how it is implemented for each shape.
     */
    public static void abstraction() {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());

        Person p = new Employee(1, 1000);
        System.out.println(p.getEarnings());
    }

    /*
     * Polymorphism is the ability of an object to take on many forms.
     * This is done through method overloading and method overriding.
     * 
     * For example, getSalary() method produces different results for Employee and Manager class.
     * 
     * Functions with same name but different signatures (parameters and their types) are called overloaded functions.
     * Method overloading is an example of compile time polymorphism, 
     * because the method to be called is decided at compile time.
     * 
     * Method overriding is an example of run time polymorphism, 
     * because the method to be called is decided at run time.
     */
    public static void polymorphism() {
        Employee employee1 = new Employee(1, 1000);

        String salary = employee1.getEarnings();
        System.out.println(salary);

        String salaryString = employee1.getSalary("Rs.");
        System.out.println(salaryString);

        Employee[] reportees1 = { employee1 };
        Manager manager1 = new Manager(7, 12000, reportees1);
        System.out.println(manager1.getSalary("USD"));
    }

    // Inheritance is a mechanism in which one class acquires the property of another class.
    // For example, Manager class inherits from Employee class.
    //
    // Inheritance is a process of defining a new class based on an existing class by extending its common data members and methods.
    // The new class is called derived (or child) class and the one from which it inherits is called the base (or parent) class.
    // The derived class inherits all the features from the base class and can have additional features of its own.
    // 
    // Inheritance helps to reuse code, as we don't have to write the same code again.
    // It also helps in reducing the size of the code.
    // It also helps in changing the behavior of a method in child class, that is polymorphism.
    //
    // Multiple inheritance is not supported in Java, that is, a class cannot inherit from multiple classes.
    public static void inheritance() {
        Employee employee1 = new Employee(1, 1000);
        Employee employee2 = new Employee(2, 2000);
        Employee employee3 = new Employee(3, 3000);
        Employee employee4 = new Employee(4, 4000);
        Employee employee5 = new Employee(5, 5000);

        Employee[] reportees1 = { employee1, employee2 };
        Manager manager1 = new Manager(6, 10000, reportees1);

        Employee[] reportees2 = { employee3, employee4, employee5 };
        Manager manager2 = new Manager(7, 12000, reportees2);

        System.out.println(manager2.getSalary());

        System.out.println(manager1.isReportee(employee1));
        System.out.println(manager1.isReportee(employee3));
        System.out.println(manager2.isReportee(employee1));
        System.out.println(manager2.isReportee(employee3));
    }
}

public abstract class Person {
    String name;
    String govtId;

    abstract public String getEarnings();
}

// Employee class has to be abstract because it has an abstract method
// Otherwise, we will get the following error:
// Employee is not abstract and does not override abstract method work() in Employee
public class Employee extends Person {
    int id;
    int salary;
    String name;

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    // Overloading
    public String getSalary(String currency) {
        return currency + " " + String.valueOf(salary);
    }

    public String getEarnings() {
        return "Earnings: " + getSalary();
    }
}

public class Manager extends Employee {
    Employee[] reportees;
    
    public Manager(int id, int salary, Employee[] reportees) {
        super(id, salary);
        this.reportees = reportees;
    }

    public boolean isReportee(Employee employee) {
        for (Employee reportee : reportees) {
            if (reportee.id == employee.id) {
                return true;
            }
        }

        return false;
    }

    @Override // Not mandatory, but good practice, helps in readability
    public String getSalary(String currency) {
        return super.getSalary(currency) + " (Manager)";
    }
}

abstract class Shape {
    String type;
    abstract public double getArea();

    public String getType() {
        return type;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.type = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public boolean isSquare() {
        return length == breadth;
    }
}