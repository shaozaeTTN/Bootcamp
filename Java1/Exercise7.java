package Java1;

//  Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

class student{
    static int age = 21;

    static {
        System.out.println("Vishodu ");
    }
    public static void lastname(){
        System.out.println("Shaozae");
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        student obj = new student();
        obj.lastname();
        System.out.println(obj.age);
    }
}
