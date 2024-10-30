import java.util.Scanner;

public class quadrtic {
    public static void main(String args[]){
        int a,b,c;
        double root1,root2;
        System.out.println(" enter the a ,b and c ");
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        // root1 = (-b + (Math.sqrt((b*b)-(4*a*c))))/(2f*a);
        // root1 = (+b - (Math.sqrt((b*b)-(4*a*c))))/(2f*a);
            root1= (-b+ Math.sqrt(b*b-4*a*c))/(2/a);
            root2= (-b- Math.sqrt(b*b-4*a*c))/(2/a);

        System.out.println("root1 is "+ root1);
        System.out.println("root2 is "+ root2);
    

    }
    
}
