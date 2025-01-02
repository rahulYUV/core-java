package Searching;

public class leetcodee1295 {
    public static void main(String args[]){
        int[] num={10,20,4,456,6788};
        Digits(10);
        Digits(456);
        Digits(999);
        Digits(7645);
        Digits(999999);
    }
    static int Digits(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        return count;

    }
}
