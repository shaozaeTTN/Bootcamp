package Java1;

import java.util.Scanner;

// Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

public class Exercise8 {
        public static void revdel(String A){
            StringBuilder SB = new StringBuilder();
            SB.append(A);
            SB = SB.reverse();
            System.out.println("Reversed String:" + SB);
            StringBuffer bar = new StringBuffer(SB);
            bar = bar.delete(4,9);
            System.out.println("Updated String:" + bar);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use predefined string:");
        System.out.println("2. Enter desired string (greater than 10):");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                String foo = "Hello world";
                System.out.println("The string of words:");
                System.out.println(foo);
                revdel(foo);
                break;
            case "2":
                System.out.println("Enter your string");
                foo = scanner.nextLine();
                System.out.println("The string of words:");
                System.out.println(foo);
                revdel(foo);
                break;
        }
    }
}
