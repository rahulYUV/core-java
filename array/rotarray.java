public class rotarray {
    public static void main(String[] args) {
    //     int arr[] = {10, 20, 30, 40, 50};
    //     int len = arr.length;
    //     int k = 39;

    //     int temp[] = new int[len]; // Initialize the temp array with the same length as arr
        
    //     // Rotate the array
    //     for (int i = 0; i < len; i++) {
    //         int newindex = (i + k) % len;
    //         temp[newindex] = arr[i];
    //     }

    //     // Copy the rotated array back to the original array
    //     for (int i = 0; i < len; i++) {
    //         arr[i] = temp[i];
    //     }

    //     // Print the rotated array
    //     for (int x : arr) {
    //         System.out.println(x);
    //     }


    int arr[]={10,20,30,40,50};
    int temp = arr[0];
    for(int i =0;i<(arr.length)-1;i++){
            arr[i]= arr[i+1];
    }
    arr[arr.length-1]= temp;
    for(int x: arr){
        System.out.print(x);
    }
}
}
