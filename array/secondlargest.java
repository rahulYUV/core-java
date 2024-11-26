public class secondlargest {
    public static void main(String args[]){
        int arr[]={1,3,5,6,7,9,8};
        int sl=0;
        int largest=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>largest&&arr[i]>sl){
                sl = largest;
                largest = arr[i];

            }
            else if(arr[i]>sl&& arr[i]<largest){
                sl = arr[i];
            }
        }
        System.out.println(sl);

    }
    
}
