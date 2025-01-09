package stream.javaPackage;

//5. Write a Java program to count the number of strings in a list that start with a specific
//letter using streams.

import java.util.Arrays;
import java.util.List;

public class stream_que_5 {
    public static void main(String[] args){
        // let's say we have to count the number of strings that with the letter a
        List<String> list = Arrays.asList("anchal", "alex", "aaron", "tim", "ben", "george");
        long ans = list.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(ans);
    }
}
