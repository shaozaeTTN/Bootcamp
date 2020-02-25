package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Find the first even number in the integer list which is greater than 3.
 */

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,7,6,5,2,3,4,4);
        list.stream()
                .filter(e -> e % 2 == 0)
                .filter(e -> e > 3)
                .findFirst()
                .ifPresent(e -> System.out.println(e));
    }
}
