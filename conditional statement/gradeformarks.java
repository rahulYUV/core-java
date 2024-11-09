import java.util.Scanner;

public class gradeformarks {
    public static void main(String args[]){

    
    int m1,m2,m3;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the three marks");
    m1= sc.nextInt();
    m2= sc.nextInt();
    m3= sc.nextInt();
    int totalavg = (m1+m2+m3)/3;
            if(totalavg>=70){
                System.out.println(" the grade is A*");
            }
            else if(totalavg>=60 && totalavg <= 70 ){
                System.out.println("the grade is B");

            }
            else if(totalavg>=50&& totalavg <= 60 ){
                System.out.println("the grade is c");

            }
            else if(totalavg>=40&& totalavg <= 50){
                System.out.println("the grade is d ");

            }
            else{
                System.out.println("the grade is f: ");
            }






    }
}
