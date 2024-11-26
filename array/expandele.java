public class expandele {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,0,0,0,0};
        int x = 100;
        int n =5;

        int indi =2;


        for(int i=n;i>indi;i--){
            arr[i]=arr[i-1];
        }
        arr[indi]= x;
        for(int z: arr){
            System.out.println(z);
        }
    }
}
