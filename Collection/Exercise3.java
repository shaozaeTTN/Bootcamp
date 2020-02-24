package Collection;

import java.util.*;

/*
Write a method that takes a string and print the number of occurrence of each character characters in the string.
 */

public class Exercise3 {
    public static void occurence(String str){
        str = str.toLowerCase();
        str = str.replaceAll("\\s","");
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new LinkedHashSet<>(list);
        for (String ele:set) {
            System.out.println(ele + " : " + Collections.frequency(list , ele));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String foo = scanner.nextLine();
        occurence(foo);
    }
}
