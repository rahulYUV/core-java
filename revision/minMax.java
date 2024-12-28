package revision;

public class minMax {
    public static void main(String args[]){
        // int a = getMaxi(35,35 , 35);
        // System.out.println(a);

        int b= maxi(25, 272, 273);
        System.out.println(b);
        
    }

    // to get maxium bw three no ;
    public static int getMaxi(int a , int b, int c){

        if(a>b){
            if(a>c){
                return a;

            }
            else{
                return c;

            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                System.out.println("this is the else/else");
                return c;

            }
        }

    }

    //this is the optimal 
    static int maxi(int a,int b,int c){
       if(a>b && a>c)
       return a;
       else if(b>a&& b>c){
        return b;
       }
       else{
        return c;
       }
    }
}
