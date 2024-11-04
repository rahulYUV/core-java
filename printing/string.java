import java.util.Scanner;

public class string{
    public static void main(String args[]) {
        String input;
        String sentence = "my name is tony stark";

        // Initialize the scanner
        Scanner sc = new Scanner(System.in);

    //     System.out.println("Please enter the sentence 'my name is tony stark':");

    //     // Use nextLine to capture the whole line from user input
    //     input = sc.nextLine();

    //     // Compare the input with the predefined sentence
    //     if (input.equals(sentence)) {
    //         System.out.println("Input matches: " + input);
    //     } else {
    //         System.out.println("Input does not match. You entered: " + input);
    //     }

    //     // Close the scanner
    //     sc.close();
    //
          String first= "tony";
          String second = "stark";
          String third = first+second;
         
     
          //System.out.println(third.charAt(5));
          String avg = "tony ";
          String abc ="tony";
          System.out.println(avg.compareTo(abc));


    }
}
