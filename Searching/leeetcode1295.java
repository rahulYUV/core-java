package Searching;

public class leeetcode1295 {
    public static void main(String args[]){
        int[] nums={12,345,2,6,7896,999};
        int no = count( nums);
        System.out.println(no);
    }
    public static int count(int arr[]){
        int count =0;
       for(int i =0;i<arr.length;i++){
        int num= arr[i];
        int digits=1;
           while(num>0){
            digits++;
           num = num/10;
            
           }
           if(digits%2==0){
            count++;
           }

        }
        return count;
    }
}
