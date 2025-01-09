package stream.javaPackage;

//Q. Find the longest string in a list of strings using Java streams:

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class stream_que_9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ice", "water", "fire", "snow", "rain");
        Optional<String> ans = list.stream().max(Comparator.comparingInt(x -> x.length()));
        System.out.println(ans.get());
    }
}
