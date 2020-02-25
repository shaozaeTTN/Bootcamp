package Java8Features;

import java.util.Arrays;
import java.util.List;


/*
Find average of the number inside integer list after doubling it.
*/

public class Exercise11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,7,6,5,2,3,4,6);
        list.forEach(e-> System.out.print(e+" "));
        System.out.println("\n======================");
        list.stream()
                .map(e->e*2)
                .mapToInt(e -> e)
                .average()
                .ifPresent(avg -> System.out.println("Average is after doubling: " +avg));
        };
}
