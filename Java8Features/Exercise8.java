package Java8Features;

/*
 Implement multiple inheritance with default method inside  interface.
 */

interface Demo1 {
    default void foo() {
        System.out.println("foo");
    }

    default void print() {
        System.out.println("From Demo1 print");
    }
}

interface Demo2 {
    default void bar() {
        System.out.println("bar");
    }

    default void print() {
        System.out.println("From Demo2 print");
    }
}

class Exercise8 implements Demo1, Demo2 {

    public static void main(String[] args) {
        Exercise8 m = new Exercise8();
        m.foo();
        m.bar();
        m.print();
    }

    public void print() {
        Demo1.super.print();
        Demo2.super.print();
    }
}
