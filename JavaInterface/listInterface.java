package JavaInterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class listInterface {
    public static void main(String[] args) {
      List<String> words = new ArrayList<>();
      words.add("Hello");
      words.add("World");
      words.add(1, "Java");
      System.out.println("Words: " + words);
      System.out.println("First: " + words.get(0) + ", Size: " + words.size());

      words.add("rahul");
      words.add(0,"kumar");
    //   for(String x : words){
    //     System.out.println(x);


    // }
    words.set(0,"this is java");
    words.remove(0);
    words.add(0,"this is the zero");
    for(String x : words){
        System.out.println(x);
    }
    }
}
