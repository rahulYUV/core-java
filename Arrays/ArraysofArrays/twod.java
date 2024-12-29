

public class twod {
    public static void main(String args[]){
        // syntax 
        // int[row][column] referencevariable= new int[sizeRow][sizeColumn];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[0][0]);
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
