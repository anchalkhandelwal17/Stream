package stream.javaPackage;

//1. Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class stream_que_1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        double avg = list.stream().mapToDouble(x -> x).average().orElse(0.0);
        System.out.println(avg);
    }
}
