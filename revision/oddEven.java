package revision;

public class oddEven {
    public static void main(String args[]){
    //   int flag =evenOdd(90);
    //   if(flag==0){
    //     System.out.println("this is the odd number ");
    //   }else{
    //     System.out.println("this is the even number ");

    //   }

      boolean c = iseven(998);
      System.out.println(c);
    }
    //using bool 
    static boolean iseven(int num){
        if(num%2==0){
            return true;

        }
        else{
            return false;

        }

    }
    //weather a number is even or odd;
    static int evenOdd(int num){
        if(num%2==0){
            return 1;
        }
        else{
            return 0;

        }
    }
    
}
