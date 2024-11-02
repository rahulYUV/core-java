import java.util.Scanner;

public class cuboid {

    public static void main(String args[]){
        int l,b,h,area,vloume;
        Scanner bc = new Scanner(System.in);
        System.out.println(" enter the length , bradth and height of the cuboid");
        l = bc.nextInt();
        b = bc.nextInt();
        h= bc.nextInt();
        area =2*((l*b)+(b*h)+(l*b));
        vloume = l*b*h;
        System.out.println((" the area and voulme is"+ area +" "+ vloume));
    }

    
}
