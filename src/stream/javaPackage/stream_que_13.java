package stream.javaPackage;

//Q. Find the intersection of two lists using Java streams:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_que_13 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 4, 5, 6, 7, 9);

        // 2, 4, 5, 6

        List<Integer> ans = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(ans);
    }
}
