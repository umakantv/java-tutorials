
# Access Modifiers

## Access Modifiers in Java

- Access modifiers are used to restrict the access of a class, constructor, data member, and method in another class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
- There are four types of Java access modifiers:
  - Private
  - Default
  - Protected
  - Public


## Access Modifiers and their Access Levels


| Access Modifier | Access Level | Same Class | Same Package | Subclass | Other Packages |
| --------------- | ------------ | ---------- | ------------ | -------- | -------------- |
| Private         | Lowest       | Y          |              |          |                |
| Default         |              | Y          | Y            |          |                |
| Protected       |              | Y          | Y            | Y        |                |
| Public          | Highest      | Y          | Y            | Y        | Y              |


## Private

- Private access modifier is the most restrictive access level. We can use private access modifier with variables, methods, and constructors but not with the class. It cannot be applied to the class.
- If we declare any variable, method, or constructor as private, it will be available to the particular class only.

## Default

- If we do not mention any access modifier, it will be considered as the default access modifier. The scope of the default modifier is limited to the package only. We cannot use default outside the package. It cannot be applied to the class.

## Protected

- Protected access modifier is more restrictive than public. It provides more accessibility than the default modifier. We can use protected access modifier with variables, methods, and constructors but not with the class. It cannot be applied to the class.
- If we declare any variable, method, or constructor as protected, it will be available to the classes of the same package or the subclasses present in any package.
- It cannot be applied to the class.

## Public

- Public access modifier is the most permissive access level. There is no restriction on accessing public members anywhere.


# Non-Access Modifiers

## Non-Access Modifiers in Java

- Java provides a number of non-access modifiers to achieve many other functionality.
- The static modifier for creating class methods and variables.
- The final modifier for finalizing the implementations of classes, methods, and variables.
- The abstract modifier for creating abstract classes and methods.

## Static

- The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks, and nested classes. The static keyword belongs to the class than an instance of the class.
- The static can be:
  - Variable (also known as a class variable)
  - Method (also known as a class method)
  - Block
  - Nested class

## Final

- The final keyword in java is used to restrict the user. The java final keyword can be used in many contexts. Final can be:
  - Variable
  - Method
  - Class

## Abstract

- Abstract keyword is used to create an abstract class and abstract method. Abstract class in Java can only be extended, not instantiated. It can have abstract and non-abstract methods (method with the body).
