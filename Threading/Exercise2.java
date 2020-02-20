package Threading;

//Write a program to create a thread using Thread class and Runnable interface each.

class Processor extends Thread{
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("Foobar - Using thread class");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Foobar - Using Runnable interface");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Exercise2 {

    public static void main(String[] args) {

        Processor proc = new Processor();
        Thread t1 = new Thread(new Runner());
        proc.start();
        t1.start();
    }

}
