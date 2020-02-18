package Java1;

import java.util.Scanner;

// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String

public class Exercise4 {
    public static void StringStats(String A){
        int n = A.length();
        float upper = 0, lower = 0, digits = 0, special = 0;
        for(int i = 0; i < A.length(); i++)
            {
                char ch = A.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    upper++;
                else if (ch >= 'a' && ch <= 'z')
                    lower++;
                else if (ch >= '0' && ch <= '9')
                    digits++;
                else
                    special++;
            }
        System.out.println("Number and Percentage of Uppercase: "+ upper + " , " + (upper/n)*100 +"%");
        System.out.println("Number and Percentage of lower: "+ lower + " , " + (lower/n)*100 +"%");
        System.out.println("Number and Percentage of digits: "+ digits + " , " + (digits/n)*100 +"%");
        System.out.println("Number and Percentage of special characters: "+ special + " , " + (special/n)*100 +"%");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Use predefined string of words");
        System.out.println("2. Enter desired string of words");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                String foo = "How much w00d would @ W00dchuck chuck if @ W00dchuck could chuck w00d?";
                System.out.println("The string of words:");
                System.out.println(foo);
                StringStats(foo);
                break;
            case "2":
                System.out.println("Enter your string");
                foo = scanner.nextLine();
                System.out.println("The string of words:");
                System.out.println(foo);
                StringStats(foo);
                break;
        }
    }
}
