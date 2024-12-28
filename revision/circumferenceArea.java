package revision;

public class circumferenceArea{

    public static void main(String args[]){

            double radius = 720;
            double area = circleArea(radius);
            double circumference1 = circumferenceArea(radius);
            disp(area);
            disp(circumference1);




       
    }
    // area function 
    static double circleArea(double radius){
        double area = 3.14*radius*radius;
        return area;
    }
    static double circumferenceArea(double radius){
        double circumference= 2*3.14*radius;
        return circumference;

    }

    static void disp(double value){
        System.out.println("this is the "+(value));
    }

    
}
