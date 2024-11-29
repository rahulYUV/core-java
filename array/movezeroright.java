public class movezeroright {
    
    public static void main(String args[]){
        int arr[]={1,2,0,4,3,0,5,0};
        int temp[] = new int[arr.length];
        int n = arr.length;
            int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
              
            }

        }
        for(int x:temp){
            System.out.println(x);
        }
    }
}
