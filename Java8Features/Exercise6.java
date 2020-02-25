package Java8Features;

/*
Create and access default and static method of an interface.
 */

interface StaticDefaultInterface {
    default void foo()
    {
        System.out.println("This is from the default method of Interface");
    }
    static void bar()
    {
        System.out.println("This is from the static method of Interface");
    }
}

public class Exercise6 implements StaticDefaultInterface {

    public static void main(String[] args) {
        new Exercise6().foo();
        StaticDefaultInterface.bar();
    }

}