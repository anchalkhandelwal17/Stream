package stream.javaPackage;

//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stream_que_3 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = list.stream().filter(x -> x%2 == 0).reduce((a, b )-> a + b).orElse(0);
        System.out.println(sum);

    }
}
