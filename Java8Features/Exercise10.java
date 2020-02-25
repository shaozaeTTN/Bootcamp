package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Sum all the numbers greater than 5 in the integer list.
 */

public class Exercise10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,7,6,5,2,3,4,6);
        Integer ele = list.stream().
                filter(e -> e > 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum of the numbers greater than 5 = "+ele);
    }
}
