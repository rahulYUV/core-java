package Searching;

public class linear {
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int index = linearSearch(arr,20);
        if(index==-1){
            System.out.println("not found ");
        }
        else{
            System.out.println("key at index: "+ index);
        }
    }
    
    static int  linearSearch(int arr[],int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;
    }
}
