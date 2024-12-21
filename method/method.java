import java.util.*;

public class method {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

            int a =10;
            {
                // int a =20;
                //alredy init in the same method so it can't change (it dosent init again)
                //but we can modify the value
                a=100;//modify the value because this is reference same object;
                

            }
            System.out.println(a);
        // add();
        // int c=add();
        // System.out.println("this is the c"+c);

        // String str = new String("singh");

        // greet(str);
     
     
    //    String personalised=greeting("raghu");
    //    System.out.println(personalised);
    //    int a =5,b=10;

    //     swap(a,b);
    //     System.out.print("this is the test");

    //     System.out.println(a+b);
    //     System.out.println("this is a "+a+"this is the b: "+b
    //     );
        

        int arr[]={0};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
        // String name= "rahul kumar";
        // changename(name);
        // System.out.println(name);

    // int a,b=45;
    // a=factt(b);
    // System.out.println("this is the fact of a : "+a);
    }
    public static void greet(String name){
        System.out.println("have a good day: "+name);
    }
     static int  add(){
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("the first and second number");
        num1 =sc.nextInt();
        num2=sc.nextInt();
        sum = num1+num2;
        System.out.println(" the summatin is :"+ sum);
        return sum;

    }

    //pass the value of the number when  you are calling the method in main= parametere 
    public static int sum(int a,int  b){
        return a+b;

    }

    static String greeting(String name ){
        String message = "hey"+name;
        return message;

    }

// pass by value 
//changes are locally 

    public static void  swap(int a,int b ){
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("this the inside the swap fn ");
        System.out.println("this is a "+a+"this is the b: "+b
        );

    }
    public static int factt(int n){
        if(n==1){
            return 1;

        }
        else{
                return n*factt(n-1);

        }
    }
    
static String changename(String name){
    name ="naya naam ";
    System.out.println( name );
    return name;
    
}



//function is the block of code 
//take a input of two no and print their sum 
//how the thing work internally 
 
public static void change(int arr[]){
    arr[0]=99;
    //the value is changes now 
}



























}