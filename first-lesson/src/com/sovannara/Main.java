package com.sovannara;

// import java.util.Arrays;

public class Main {
    /*
    * Access modifier
    * Optional static
    * Return type
    * Method name
    * Optional parameters
    * Method body
    * Optional return value
    */
    /* private static int add(int n1, int n2) {
        return n1 + n2;
    } */

    /* private static double calculateRentalYield(double monthlyRentIncome, double purchasedPropertyPrice) {
        double annualRental = monthlyRentIncome * 12;
        return (annualRental / purchasedPropertyPrice) * 100;
    } */

    public static void main(String[] args) {
        System.out.println("Hello Java!");
    /* int num1 = 1;
        int num2 = 2;
        int total = num1 + num2;
        System.out.println("Total = " + total);
        int num = 0;
        System.out.println(num--);
        System.out.println(num);
        int num2 = 0;
        System.out.println(--num2);
        System.out.println(num2);
        int[] numbers = new int[3];
        // int[] numbers = {10, 20, 30};
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(Arrays.toString(numbers));
        int[] numbers = new int[3];
        // default empty value of primitives type is 0
        // want to change default empty value of primitives type
        Arrays.fill(numbers, 1);
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers));
        String[] names = new String[3];
        // default empty value of references type is null
        // want to change default empty value of references type
        Arrays.fill(names, "empty");
        names[1] = "John Wick";
        System.out.println(Arrays.toString(names));
        String[] names = {
                "John Wick",
                "John Snow",
                "John Saw",
                "John Doe",
                "John Navy"
        };
        for (String name : names) { // => for (int i = 0; i < names.length; i++)
            System.out.println(name);
        }
        int result = add(10, 10);
        System.out.println("Result = " + result);
        double rentalYieldResult = calculateRentalYield(1300, 250_000);
        System.out.println("Rental Yield Result = " + String.format("%.2f", rentalYieldResult) + "%"); */
    }
}
