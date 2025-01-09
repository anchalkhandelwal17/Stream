package stream.javaPackage;

//Q. Check if a list of integers contains a prime number using Java streams:

import java.util.Arrays;
import java.util.List;

class Prime {
    public static boolean isPrime(int x){
        // so if a number is divisible by 1 and itself only then it is a prime number
        if(x <= 2) return true;
        for(int i=2; i*i<=x; i++){
            if(x % i == 0) return false;
        }
        return true;
    }
}

public class stream_que_11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean containsPrime = list.stream().anyMatch((Prime::isPrime));
        System.out.println(containsPrime);
    }
}
