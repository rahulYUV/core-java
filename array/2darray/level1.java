
public class level1 {
    public static void main(String args[]){
        int arr[][]= new int[3][5];
        
        int a[][]={{1,2,3},{2,3}};
        System.out.println(a.length);

            // for(int i =0;i<a.length;i++){
            //     for(int j=0;j<a[1].length;j++){
            //         System.out.println(a[i][j]);
            //     }
            // }
                for(int x[]:a){
                    for(int y:x){
                        System.out.println(y);
                    }
                }

    }
    
}
