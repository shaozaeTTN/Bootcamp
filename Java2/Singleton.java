package Java2;

/*
4. WAP to create singleton class.
 */

public class Singleton {

    private static Singleton myObj;

    static{
        myObj = new Singleton();
    }

    private Singleton(){ }

    public static Singleton getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Eurekaa...it is working!!!");
    }

    public static void main(String args[]){
        Singleton s = getInstance();
        s.testMe();
    }
}