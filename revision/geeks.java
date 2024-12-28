package revision;

public class geeks {
    public static void main(String args[]){
        int sum =0;
       sum = addTwoInt(45,34);
       disp(sum);



    }
    //to add two numbers ;
    public static int addTwoInt(int a , int b){
        int c = a+b;
        return c;

    }
   //helper function 
   static void disp(int x){
    System.out.println("the addition of the given int is: "+ x);
   }
    
}
