package Java2;

import java.util.Scanner;

/*
8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
a)while statement
b)do-while statement
 */

public class Exercise8 {
    public static void usingwhile() {
        System.out.println("Enter words, Type 'done' to stop");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while(!(word.equalsIgnoreCase("done"))){
            if(word.charAt(0)!=word.charAt(word.length()-1)){
                System.out.println(word +": does not contain the same first and last characters");
            }
            else{
                System.out.println(word +": does contain the same first and last characters");
            }
            word = scanner.nextLine();
        }
        return;
    }

    public static void usingdowhile() {
        System.out.println("Enter words, Type 'done' to stop");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if(!word.equalsIgnoreCase("done")) {
            do {
                if (word.charAt(0) != word.charAt(word.length() - 1)) {
                    System.out.println(word + ": does not contain the same first and last characters");
                } else {
                    System.out.println(word + ": does contain the same first and last characters");
                }
                word = scanner.nextLine();
            } while (!(word.equalsIgnoreCase("done")));
        }
        return;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use while");
        System.out.println("2. Use dowhile");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                Exercise8.usingwhile();
                break;
            case "2":
                Exercise8.usingdowhile();
                break;
        }
    }
}
