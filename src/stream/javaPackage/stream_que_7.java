package stream.javaPackage;

//7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class stream_que_7 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(25, 17, 10, 23, 20, 6);
        Optional<Integer> min = list.stream().min((a, b) -> a-b);
        System.out.println("The min ele in list is: " + min.get());   // 6

        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println("The max ele in list is: " + max.get());   // 25
    }
}
