

import java.util.ArrayList;

public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(555);
        System.out.println(list);
        System.out.println(list.get(3)); // arr[index] dosent work
       
        // System.out.println("this is the 4th element "+list(3));
    }
    
}
