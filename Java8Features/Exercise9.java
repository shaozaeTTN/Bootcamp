package Java8Features;

import java.util.Arrays;
import java.util.List;

/*
Collect all the even numbers from an integer list.
 */

public class Exercise9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,7,6,5,2,3,4,6);
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e+ " "));
    }
}
