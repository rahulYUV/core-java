import java.util.Scanner;

public class todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter an integer:");
        n = sc.nextInt();
        System.out.println("The value is " + n);

        sc.close(); // Close the scanner to prevent resource leak
    }
}
