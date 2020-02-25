package Java8Features;


/*
Create a functional interface whose method takes 2 integers and return one integer.
 */

@FunctionalInterface
interface Sum{
    int sum(int n, int m);
}

public class Exercise2 {
    public static void main(String[] args) {
        Sum obj = (int n, int m) -> {
            return n+m;
        };

        System.out.println("10 + 5 = "+obj.sum(10, 5));
    }
}
