import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // for(int i =0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         System.out.println("enter the "+i+"th and"+j);
        //         arr[i][j]=sc.nextInt();     
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     for(int j =0;j<arr.length;j++){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }

        int brr[][];//-> decelartion of array 
        brr = new int[3][2]; // initilization of array -<
        // to take input
        for(int i =0;i<brr.length;i++){
            for(int j =0;j<brr[i].length;j++){
                brr[i][j]= sc.nextInt();

            }
        }
        // to show output 
        for(int[] element: brr){// element is the array inside a array 
            System.out.println(element);
        }
        // using string function ;
        System.out.println("this is the string function");
    System.out.println(Arrays.toString(brr));
        
        for(int i =0;i<arr.length;i++){
                for(int j =0;j<arr.length;j++){
                    System.out.print(brr[i][j]);
                }
                System.out.println();
            }
               sc.close();
    }
}
