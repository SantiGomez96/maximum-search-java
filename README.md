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
