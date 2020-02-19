package Java2;

import java.util.*;
/*
7. WAP to convert seconds into days, hours, minutes and seconds.
 */
public class Exercise7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int sec = ((seconds % 86400) % 3600) % 60;
        int min = ((seconds % 86400) % 3600) / 60;
        int hours = (seconds % 86400) / 60;
        int days = seconds / 86400;
        System.out.print( days + ":" + hours + ":" + min + ":" + sec);
        System.out.print("\n");
    }
}
