package Question;

public class maxi {
    public static void main(String args[]){
        int arr[]={1,3,23,9,18};
       int maxiii= max(arr);
       System.out.println(maxiii);
    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
