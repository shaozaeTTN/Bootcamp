package Threading;


import java.util.concurrent.*;


public class Exercise9 {

    public static class ProcessThread implements Runnable {

        CountDownLatch latch;
        long workDuration;
        String name;

        public ProcessThread(String name, CountDownLatch latch, long duration) {
            this.name = name;
            this.latch = latch;
            this.workDuration = duration;
        }


        public void run() {
            try {
                System.out.println(name + " Processing for " + workDuration / 1000 + " second(s)");
                Thread.sleep(workDuration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "completed!");

            latch.countDown();
        }
    }


    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(new ProcessThread("Worker1", latch, 2000)).start(); // time in millis.. 2 secs
        new Thread(new ProcessThread("Worker2", latch, 6000)).start();//6 secs
        new Thread(new ProcessThread("Worker3", latch, 4000)).start();//4 secs


        System.out.println("waiting for Child(ren) process(es) to finish...");
        try {
            //current thread will get notified if all chidren's are done
            // and thread will resume from wait() mode.
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed all processes!");

        System.out.println("Parent Thread Resuming work....");


    }
}
