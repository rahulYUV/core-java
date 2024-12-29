public class arraytomethod {
    
    public static  void main(String args[]){
        int[] arr= {1,4,2,5,3};
        int sum = sum(arr);
        System.out.println(sum+"it is the summation array");

    }
    static int sum(int arr[]){
        int summ =0;
        for(int x: arr){
            summ+=x;


        }
        
        
        return summ;

    }


}
