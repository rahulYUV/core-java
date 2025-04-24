package Question;

import java.util.Arrays;

public class swapp {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,45};
        for(int x:arr){
            System.out.print(x);
        }
        swapp(arr,1,4);
        System.out.println(Arrays.toString(arr));
        

    }
    //swap function;
    static void swapp(int arr[],int index1,int index2){
        // int temp = arr[index1];
        //  arr[index1]= arr[index2];
        //  arr[index2]= temp;

    // method 2 -> xor
    arr[index1]=arr[index1]^arr[index2];
    arr[index2]=arr[index1]^arr[index2];
    arr[index1]= arr[index1]^arr[index2];
    }
}

