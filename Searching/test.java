package Searching;

public class test {
    public static void main(String args[]){
        int[] num={10,20,4,456,6788};
        // if no is neg make it positive
        // Digits(10);
        // Digits(456);
        // Digits(999);
        // Digits(7645);
        // Digits(999999);

        int no = noofEven(num);
        System.out.println(no);
    }
    static int Digits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        
        return count;

    }
    static int noofEven(int arr[]){
        int count=0;

        for(int i =0;i<arr.length;i++){
            int digit= Digits(arr[i]);
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}
