public class passingfubction {
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0]=1;
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);


    }
    static void change(int arr[]){
        arr[0]=99;

    }
    
}
