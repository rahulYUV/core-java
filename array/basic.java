import java.util.Scanner;

public class basic{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Process array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        // Output results
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + avg);

        sc.close();
    }
}
