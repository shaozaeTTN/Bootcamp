package Collection;

import java.util.*;

/*
Write a method that takes a string and returns the number of unique characters in the string.
 */

public class Exercise2 {
    public static void getunique(String str){
        str = str.replaceAll("\\s","").toLowerCase();
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new HashSet<String>(list);
        System.out.println("Number of characters in the string: "+ list.size());
        System.out.println("Number of unique characters in the string: " + set.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String foo = scanner.nextLine();
        getunique(foo);
    }
}
