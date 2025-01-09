package stream.javaPackage;

//8. Write a Java program to find the second smallest and largest elements in a list of
// integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stream_que_8 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
        Optional<Integer> secondSmallest = list.stream().distinct().sorted().skip(1).findFirst();
        System.out.println(secondSmallest.get());     // 20

        Optional<Integer> secondLargest = list.stream().distinct().sorted((a, b) -> b-a).skip(1).findFirst();
        System.out.println(secondLargest.get());      // 70
    }
}
