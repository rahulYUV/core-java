import java.util.Scanner;

public class leapyar {
    public static void main(String args[]){
          
        int year;
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter the year");
       year = sc.nextInt();
       if(year%100==0 && year%4!=0){
        System.out.println("leap year 366");
       }
       else{
            System.out.println("non leap year");
       }
    }
    
}
