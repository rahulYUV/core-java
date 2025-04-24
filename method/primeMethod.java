import java.util.Scanner;

public class primeMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        prime();
        disp();
            
      sc.close();
    }
    //print all the armstrong no 3 digit 
    static void armstrong(int n ){
        int rem ,sum =0;
        int temp =n;

        while(n>0){
            rem = n%10;
            int cube = rem*rem*rem;
            sum+=cube;
            n = n/10;


            
        }
        if(sum ==temp){
            System.out.println(sum);
        }
        
    
    }

    static void disp(){
        for(int i=100;i<1000;i++){
            armstrong(i);
        }
    }
    static boolean prime(){
        System.out.print("enter the no for checck that the no is prime or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=1;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag = 0;
            }
           
        }
        if(flag == 1){
            System.out.println("the no is prime:"+num);
            return false;


        }
        else{
            System.out.println("the no is not prime:"+num);
            return true;


        }
        

    }
}
