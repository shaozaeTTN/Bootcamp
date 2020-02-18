package Java1;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

// Write a program to find the number of occurrences of a character in a string without using loop?

public class Exercise3 {
    public static void CountChar(String A, String C){
        if(A.contains(C)){
            int count = A.length() - A.replace(C, "").length();
            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use predefined string");
        System.out.println("2. Enter desired string");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                String foo = "Peter Piper picked a peck of pickled peppers";
                System.out.println("The string of words:");
                System.out.println(foo);
                System.out.println("Enter the character to be searched:");
                String C = scanner.nextLine();
                CountChar(foo, C);
                break;
            case "2":
                System.out.println("Enter your string");
                foo = scanner.nextLine();
                System.out.println("The string of words:");
                System.out.println(foo);
                System.out.println("Enter the character to be searched:");
                C = scanner.nextLine();
                CountChar(foo, C);
                break;
        }
    }
}
