package Java1;

import java.util.Scanner;

//Write a program to replace a substring inside a string with other string

public class Exercise1 {
    public static void replaceSubstring(String A, String B, String C){
        if (A.contains(B)){
            A = A.replace(B, C);
            System.out.println("New String:" + A);
        }
        else {
            System.out.println("substring does not exist");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String");
        String foo = scanner.nextLine();
        System.out.println("Enter substring to replace");
        String bar = scanner.nextLine();
        System.out.println("Enter substring to replace with");
        String fubar = scanner.nextLine();
        replaceSubstring(foo, bar, fubar);
    }
}
