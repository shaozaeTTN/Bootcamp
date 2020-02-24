package Collection;

import java.util.*;

/*
 Write a program to sort HashMap by value.
 */

public class Exercise4 {
    public static <Integer, String extends Comparable<? super String>> Map<Integer,String> sortvalue(Map<Integer,String>map) {
        List<Map.Entry<Integer, String >> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<Integer, String> result  = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> entry : list){
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(4174, "Vishodu");
        map.put(4153, "Shayan");
        map.put(3993, "Ammar");
        map.put(4159, "Mayank");
        map.put(3986, "Alok");

        System.out.println("Unsorted map: " + map);
        System.out.println("sorted map: " + sortvalue(map));

        /* One line solution using stream

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

         */


    }
}



