
public class demonstration {
    public static void main(String args[]){
        int x =10,y =6,z;
        z= x&y;
        System.out.println(z);//2
        // int a = 0b1010;
        // int b = 0b0001;
        // System.out.println(a+b);//11
        // System.out.println(a&b);//0

            // swap usiing bitwise operator 

        int e =10;
        int f=11;
        e=e^f;
        f=e^f;
        e=e^f;
        System.out.println(" e is : "+e +"  f is :" + f);// it good 
     //masking and merging 
      byte a=9;
      byte b =12;
      byte c;

      c= (byte) (a<<4);
      c=(byte)(c|b);
      System.out.println(c);



}
}