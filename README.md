# Maximum Search - Java

## Description

This project contains a Java program that reads a specific number of integer values and determines the maximum value among them.

The program was developed as an academic exercise for the Fundamental Programming Concepts module, applying basic Java programming concepts and good coding practices.

## Problem

The program receives a positive integer `N`, followed by `N` integer values.

The objective is to determine and print the maximum value among all the numbers entered.

The program supports values between:

- `-3000000000`
- `3000000000`

Since these values can exceed the range of the Java `int` data type, the numbers are stored using the `long` data type.

## Algorithm

The solution follows these steps:

1. Read the number of values to process.
2. Read the first number and store it as the initial maximum value.
3. Use a `for` loop to read the remaining values.
4. Compare each value with the current maximum.
5. If the current value is greater than the maximum, update the maximum.
6. Print the maximum value found.

## Programming Concepts Used

- Primitive data types
- Variables
- Standard input with `Scanner`
- Relational operators
- `if` conditional statement
- `for` loop
- Standard output with `System.out.println()`

## Example 1

### Input

```text
5 200 100 3000 656 98
```

### Output

```text
3000
```

## Example 2

### Input

```text
5 -9 -8 -6333333 -9 -2
```

### Output

```text
-2
```

## Source Code

The Java source code is located at:

```text
src/MaximumSearch.java
```

## Technologies

- Java 8
- Eclipse IDE for Java Developers
- GitHub

## Academic Context

This solution was developed based on the "Search for the Maximum" exercise from Unit 1, Scenario 2 of the Fundamental Programming Concepts course material.

The implementation, variable naming, comments, documentation, and repository structure were developed specifically for this academic contribution.

## Author

Santiago Gomez Pena
