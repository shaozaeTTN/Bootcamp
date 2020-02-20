package Threading;

//Write a program to demonstrate the use of semaphore

import java.util.concurrent.Semaphore;

public class Exercise8 {

    Semaphore binary = new Semaphore(1);

    private void work() {
        try {
            binary.acquire();

            System.out.println(Thread.currentThread().getName() + " gains access inside");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            binary.release();
            System.out.println(Thread.currentThread().getName() + " releases outside");
        }
    }


    public static void main(String args[]) {
        final Exercise8 test = new Exercise8();
        new Thread(){
            @Override
            public void run(){
                test.work();
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                test.work();
            }
        }.start();

    }

}