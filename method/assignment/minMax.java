
import java.util.Scanner;

      
public class minMax{
    // //
    // Define two methods to print the maximum and 
    //the minimum number respectively among three numbers entered by the user.

    public static void main(String args[]){
        // int x = one();
        // int x = evenOdd(4);
        // System.out.println(x);
        // boolean one = eligible(25);

        // int a = sum(5,6);
        // System.out.println(a);
        
        // System.out.println(x);
        // int y = second(100,450 , 20);
        // System.out.println(y);
        // int z = second(100,100 , 100);
        // System.out.println(z);
        // int a =second(100, 200, 250);
        // System.out.println(a);
        // factorial 
        System.out.println("the fact of 125 is : "+fact(5));

    }

   public  static int one(){
        Scanner sc = new Scanner(System.in);
    int a,b,c;
    System.out.println("enter the first no");
    a= sc.nextInt();
    System.out.println("enter the second no");
    b= sc.nextInt();
    System.out.println("enter the third no");
    c = sc.nextInt();
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;

            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }

        }



    }


    public static int second(int a,int b , int c){
        if(a==b&& a==c){
            return 0;
        }
        else{

       
        if(a>b&&a>c){
            return a;
        }
        else if(b>a&&b>c){
            return b;

        }
        else{
            return c;
        }
    }
        
    }

    static int evenOdd(int n ){
        if(n%2==0){
            return 0;
        }
        else{
            return 1;

        }
       

    }
        static boolean eligible(int num){
                if(num>=18){
                    System.out.println("he/she is eligible:happy");
                    return true;                    
                }
                else{
                    System.out.println("he/she is not eligible ");
                    return false;
                }
        }


        static int sum(int x ,int y ){
            return x+y;

        }
        static long fact(long n ){
            if(n<=1){
                    return n ;
            }
            else{
                return n*fact(n-1);

            }
        }
}
