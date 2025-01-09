package stream.javaPackage;

//Q. Calculate the average age of a list of Person objects using Java streams:

import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class stream_que_10 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("David", 24),
                                        new Person("Mike", 22),
                                        new Person("Alex", 25),
                                        new Person("Tim", 20));

        double avgAge = list.stream().mapToDouble(x -> x.age).average().orElse(0.0);
        System.out.println(avgAge);

    }
}
