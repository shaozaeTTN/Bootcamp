package Java2;

import java.util.Scanner;

/*
2. WAP to sorting string without using string Methods?.
 */

public class Exercise2 {
    public static void sortString(String A){
        char temp = 0;
        char[] chars = A.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            for (int k = 0; k < chars.length; k++) {
                if (chars[k] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[k];
                    chars[k] = temp;
                }
            }
        }
        System.out.println("Sorted String:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to be sorted:");
        String foo = scanner.nextLine();
        sortString(foo);
    }
}
