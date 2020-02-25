package Java8Features;

/*
 Override the default method of the interface.
 */

interface InterfaceTest {
    default void test() {
        System.out.println("This is from InterfaceTest class");
    }
}

public class Exercise7 implements InterfaceTest {
    @Override
    public void test() {
        System.out.println("This is from main class");
    }

    public static void main(String[] args) {
        new Exercise7().test();
    }
}