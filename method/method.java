package method;

import java.util.*;

/**
 * This class demonstrates various concepts of methods in Java including:
 * - Method parameters and return types
 * - Pass by value vs Pass by reference
 * - Variable scope
 * - Method overloading
 */
public class Method {
    public static void main(String[] args) {
        demonstrateScopeExample();
        demonstrateArrayPassByReference();
        // Other examples are commented out but organized below
    }

    // SECTION 1: Variable Scope Example
    private static void demonstrateScopeExample() {
        int a = 10;
        {
            // Cannot reinitialize 'a' here because it's already defined in outer scope
            // int a = 20; // This would cause error
            a = 100; // But we can modify the value
        }
        System.out.println("Scope example result: " + a);
    }

    // SECTION 2: Basic Method Examples
    private static void greet(String name) {
        System.out.println("Have a good day: " + name);
    }

    private static int add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first and second number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The summation is: " + sum);
        return sum;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static String greeting(String name) {
        return "hey " + name;
    }

    // SECTION 3: Pass By Value Example
    private static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Inside swap function:");
        System.out.println("a: " + a + ", b: " + b);
    }

    // SECTION 4: Recursion Example
    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // SECTION 5: String Immutability Example
    private static String changeName(String name) {
        name = "naya naam";
        System.out.println(name);
        return name;
    }

    // SECTION 6: Array Pass By Reference Example
    private static void demonstrateArrayPassByReference() {
        int[] arr = {0};
        System.out.println("Before change: " + arr[0]);
        change(arr);
        System.out.println("After change: " + arr[0]);
    }

    private static void change(int[] arr) {
        arr[0] = 99;
    }
}