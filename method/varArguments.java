import java.util.Arrays;

public class varArguments {
    public static void main(String args[]){
            change(1,2,3,4,4,5,6,7,8,9,0,11);
    }
    static void change(int ...v){
        System.out.println(Arrays.toString(v));//length is not constant;

    }
    static void fun(int x){
                                //ops concepts
                                //function overloading 
                                //it happen compile time;
                                
    }
    static void fun(char x){
                //functin overloading 
    }
}

