package stream.javaPackage;

//Q. Merge two sorted lists into a single sorted list using Java streams:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_que_12 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 4, 5, 6, 7, 9);

        List<Integer> ans = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println(ans);
    }
}
