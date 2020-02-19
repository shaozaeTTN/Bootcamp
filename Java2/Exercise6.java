package Java2;

/*
6. WAP showing try, multi-catch and finally blocks.
 */

public class Exercise6 {

    public static void main(String[] args) {
        int a[]=new int[10];
        try{
            a[5]=30/0;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception occurs");
        } finally {
            a[5] = 6;
            System.out.println("Fifth element value: " + a[5]);
            System.out.println("The finally statement is executed");
        }

    }
}