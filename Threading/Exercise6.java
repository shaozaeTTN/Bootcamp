package Threading;

//Write a program to demonstrate sleep and join methods.

class SleepJoin implements Runnable {
    @Override
    public void run() {
        System.out.println("New thread created!");
        try
        {
            Thread.sleep(2000l);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("thread completed execution");
    }
}

public class Exercise6 {
    public static void main(String[] args) throws InterruptedException {
        SleepJoin runnable=new SleepJoin();
        Thread threadDemo=new Thread(runnable);
        threadDemo.start();
        threadDemo.join();
        System.out.println("This is the main thread here!");
    }
}
