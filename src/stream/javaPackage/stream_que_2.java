package stream.javaPackage;

//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_que_2 {
    public static void main(String[] args){
        List<String> list = Arrays.asList("ABC", "DEF", "GHI", "JKL");
        List<String> ans = list.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
