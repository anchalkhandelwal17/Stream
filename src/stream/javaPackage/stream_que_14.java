package stream.javaPackage;

//Q. Remove duplicates from a list while preserving the order using Java streams:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_que_14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9);
        List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
    }
}


