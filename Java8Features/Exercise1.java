package Java8Features;

/*
Write the following a functional interface and implement it using lambda:

    (1) First number is greater than second number or not               Parameter (int ,int ) Return boolean
    (2) Increment the number by 1 and return incremented value          Parameter (int) Return int
    (3) Concatenation of 2 string                                       Parameter (String , String ) Return (String)
    (4) Convert a string to uppercase and return                        Parameter (String) Return (String)

 */

import java.util.Scanner;

@FunctionalInterface
interface FirstGreater{
    Boolean compareFirst(int n, int m);
}

@FunctionalInterface
interface Increment{
    int incrementNum(int n);
}

@FunctionalInterface
interface Concatenation{
    String concatenateStrings(String a, String b);
}

@FunctionalInterface
interface Uppercase{
    String convertUpper(String a);
}

public class Exercise1 {
    public static void main(String[] args) {
        FirstGreater firstGreater = (int n, int m) ->{
            if(n>m)
                return true;
            else
                return false;
        };

        Increment increment = (int n) ->{
            return n+1;
        };

        Concatenation concatenation = (String a, String b) ->{
            return a+b;
        };

        Uppercase uppercase = (String a) ->{
            return  a.toUpperCase();
        };

        System.out.println(firstGreater.compareFirst(5,4));
        System.out.println(increment.incrementNum(9));
        System.out.println(concatenation.concatenateStrings("Hello", "World"));
        System.out.println(uppercase.convertUpper("testing"));
    }
}
