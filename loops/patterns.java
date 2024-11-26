public class patterns {
   
public static void main(String args[]){
//    int count=1;
//     for(int i =1;i<=5;i++){
//         for(int j =1;j<=5;j++){
//             // System.out.print(j+i);
//             System.out.format("%02d",count);
//             ++count;
 
//         }
//         System.out.println();
//     }



                // int count=1;
                // for(int i =1;i<=5;i++){
                //     for(int j =1;j<=i;j++){
                //         // System.out.print(j+i);
                //     //    System.out.print(j);
                //     // System.out.format("%02d",count);
                //     // ++count;
                //     // System.out.printf("%s","*");
                //     System.out.print("_");
                //     }
                //     System.out.println();
                // }
                // int count=1;
                // for(int i =5;i>=1;i--){
                //     for(int j =1;j<=i;j++){
                //       System.out.print(j);
                //     }
                //     System.out.println();
                // }
                // for(int i =0;i<5;i++){
                //     for(int j =0;j<5;j++){
                //         if(j<=i){
                //             System.out.print(" *");
                //         }
                //         else{
                            
                //             System.out.print(" l");
                //         }
                //     }
                //     System.out.println();
                // }

                for(int i =1;i<=5;i++){
                    for(int j =5;j>=1;j--){
                        if(5-i+j>5){
                            
                            System.out.print("l ");
                        }
                        else{
                            System.out.print(" *");
                        }
                       
                    }
                    System.out.println();
                }
}
    
}
