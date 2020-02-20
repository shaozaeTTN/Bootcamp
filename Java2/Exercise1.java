package Java2;

/*1. Create Java classes having suitable attributes for Library management system.
Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
 */

class Books {

    public void display() {

        System.out.println("Harry Potter");

    }

}

//inheritance

class Chapters extends Books {

    @Override

    public void display() {

        System.out.println("Chapter 1: Prologue");

    }

    public int addtotalchapters(int x, int y) {
        System.out.println("Total chapters:");
        return x+y;

    }

//Overload

    public double addtotalchapters(double x,double y) {
        System.out.println("Total chapters including Prologue:");
        return x+y;

    }

}

//encapsulation example

class Author {

    private String name;

    public String getName() {

        return name;

    }

    public void setName(String newName) {

        name = newName;

    }

}

//abstraction

abstract class Publisher {

    public abstract void run();

}

class Edition extends Publisher{

    public void run(){

        System.out.println("\nEdition 3 published by bloomsburry");

    }

}

public class Exercise1 {

    public static void main(String[] args) {

        Books a=new Books();

        a.display();

        Chapters b=new Chapters();

        b.display();

        System.out.println(b.addtotalchapters(4,2));

        System.out.println(b.addtotalchapters(5.,2.)); //polymorphism

        Author encap = new Author();

        encap.setName("J.K. Rowling");

        System.out.print("Name : " + encap.getName() );

        Publisher test = new Edition();

        test.run();

    }

}

