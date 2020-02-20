package Threading;

//Write a program to demonstrate wait and notify methods.

class WaitNotify implements Runnable {
    public void run()
    {
        synchronized (this)
        {
            System.out.println("Running....");
            System.out.println("Sending Info");
            this.notify();
        }
    }
}

public class Exercise5 {
    public static void main(String[] args) throws InterruptedException {
        WaitNotify r1=new WaitNotify();
        Thread thread=new Thread(r1);
        thread.start();
        synchronized (thread)
        {
            System.out.println("Main thread calling wait method");
            thread.wait();
            System.out.println("main terminated");
        }
    }
}
