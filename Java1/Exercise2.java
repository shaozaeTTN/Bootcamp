package Java1;

import java.util.*;

// Write a program to find the number of occurrences of the duplicate words in a string and print them

public class Exercise2 {
    public static void countdupe(String A){
        List<String> list = Arrays.asList(A.split(" "));
        Set<String> words = new HashSet<String>(list);
        for(String word : words) {
            if(Collections.frequency(list, word) >1) {
                System.out.println(word + ":" + Collections.frequency(list, word));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use predefined string of words");
        System.out.println("2. Enter desired string of words");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                String foo = "How much wood would a woodchuck chuck if a woodchuck could chuck wood";
                System.out.println("The string of words:");
                System.out.println(foo);
                countdupe(foo);
                break;
            case "2":
                System.out.println("Enter your string");
                foo = scanner.nextLine();
                System.out.println("The string of words:");
                System.out.println(foo);
                countdupe(foo);
                break;

        }
    }

}
