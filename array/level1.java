

public class level1 {
    public static void main(String args[]){
        // int arr[] = {1,2,3,4,5};
        // arr[2]=15;
        // System.out.println(arr[2]);

        // // 

        // for(int i:arr){
        //     System.out.println(i);
        // }


        // int[] arr = {1,2,3,5};
        // System.out.println(arr.lengthth

        // int arr[]={1,2,3,4,5,6,7};
        // int sum =0;
        // for(int i =0;i<arr.length;i++){
        //     sum =+arr[i];
        // }
        // System.out.println(sum);
       
               
                // System.out.println(brr.length);
                // brr = arr;
                // for(int x:brr){
                //     System.out.println(x);
                // }
                // for(int i=0;i<arr.length;i++){
                //     brr[i]=arr[i];
                // }
                // for(int x : brr){
                //     System.out.println(x);
                // }
     // copying an revers in array 
     int arr[]={1,2,3,4,5};
     int brr[]= new int[arr.length];
        int n = arr.length-1;
        //i<arr.length && n>=0  both works
        for(int i =0;n>=0 ;i++,n--){
            brr[i]=arr[n];

        }
        for(int x: brr){
            System.out.println(x);
        }
     


    }
}
