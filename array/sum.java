import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[5];

        for(int i =0;i<arr.length;i++){
            System.out.println("enter the "+i+"th value");
            arr[i]= sc.nextInt();

        }
        int sum =0;

        for(int x:arr){
            // System.out.println(x);
            sum =sum+x;
        }
        System.out.println("sum is"+sum);
    }
    
}
