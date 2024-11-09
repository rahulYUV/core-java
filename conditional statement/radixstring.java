import java.util.Scanner;

public class radixstring {
    public static void main(String args[]){

            String str = new String();
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the input: ");
            str = sc.next();
           
            if(str.matches("[01]+")){
                System.out.println("radix is binary");
            }
            else if(str.matches("[0-7]+")){
                System.out.println("radix is octal");
            }
            else if(str.matches("[0-9]+")){
                System.out.println("decimal");
            }
            else if(str.matches("[0-9A-F]+")){
                System.out.println("HEXA");
            }
            else{
                System.out.println("invalid input");
                
            }
    }
}
