package stream.javaPackage;

//4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream_que_4 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 7, 8, 9);
        Set<Integer> ans = list.stream().collect(Collectors.toSet());

        // .distinct() can also be used here
        System.out.println(ans);
    }
}
