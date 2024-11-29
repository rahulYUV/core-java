public class arrayshift {
    public static void main(String args[]){
    //     int arr[]={10,20,30,40,50};
    //     int temp[]=new int[2];
    //     for(int i  =0;i<temp.length;i++){
    //         temp[i]=arr[i];
    //     }
    //     for(int i =0;i<arr.length-1;i++){
    //         arr[i]=arr[i+1];
    //     }
    //     int n = temp.length;
    //     int i =0;
    //         while(n!=0){
                
    //             arr[arr.length-n]=temp[i];
    //             n--;
    //             i++;

    //         }
    //     for(int x: arr){
    //         System.out.println(x);
    //     }
    // }
    // int arr[]={10,20,30,40,50};
    // int temp = arr[0];
    // // to right shift
    // // int temp = arr[arr.length-1];
    // for(int i =1;i<arr.length-1;i++){
    //     // arr[i]=arr[i-1];
    //     arr[arr.length-1]= temp;


    // }
    // arr[arr.length-1]= temp;
    // arr[0]= temp;
    

// for(int x: arr){
//     System.out.println(x);
// }


        // int arr[]={1,2,3,4,5};
        // int n = arr.length;
        // int d =3;
        // for(int i=d;i<n;i++){
        //     arr[i-d]=arr[i];

        // }
        // for(int x:arr){
        //     System.out.println(x);
        // }

        // int arr[]={10,20,30,40,50,60,70};
        // int n = arr.length;
        // int k =3;
        // for(int i =0;i<n;i++){
        //         int temp = k%n;
        //         arr[temp]= arr[i];

        // }

            int a[]={10,20,30,40,50,60};
            rotate(a,4);
            for(int x : a){
                System.out.println(x);
            }
      
}
static void rotate(int arr[],int d){
    int n = arr.length;
    d = d%n;
    if(d==0){
        return;
    }
    

    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}
    static void reverse(int arr[],int start,int end){
        while(start<end){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
                start++;
                end--;

        }
    }

}

