import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int roll[] = new int[10];
        for(int i =0;i<roll.length;i++){
                roll[i]= in.nextInt();

        }
        // for(int x : roll){
        //     System.out.println(x+"this is new");// here x represnt the print the element ;

        // }
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
    }
}
