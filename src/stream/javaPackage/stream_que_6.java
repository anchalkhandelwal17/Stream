package stream.javaPackage;

//6. Write a Java program to sort a list of strings in alphabetical order, ascending and
//descending using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_que_6 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("bat", "bowl", "apple", "dog", "cat", "zebra", "parrot");

        // let's first sort it in ascending order
        List<String> ans = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ans);

        // let's now sort it in descending order
        List<String> ans2 = list.stream().sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println(ans2);
    }
}
