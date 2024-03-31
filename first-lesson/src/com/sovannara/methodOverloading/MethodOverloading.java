package com.sovannara.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        print(numbers);

        print("John Wick");

        printNumbers(10, 20, 30, 40 ,50);
    }

    // VarArg
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Overloading Method
    // Using the overloading method makes your codes more consistent
    public static void print(double... prices) {
        for (double price : prices) {
            System.out.println(price);
        }
    }
    public static void print(String name) {
        System.out.println(name);
    }
    public static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
