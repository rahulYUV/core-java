import java.util.Scanner;

public class areaTriangle {
    
    public static void main(String args[]){
        float area, base, height;
        System.out.println("enter teh base and height");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = base*height*0.5f;
        System.out.println("the area of the traingle is "+ area);


    }
}
