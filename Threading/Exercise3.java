package Threading;

//Write a program using synchronization block and synchronization method

public class Exercise3 {
    private int counter = 0;

    // Synchronized BLOCK

    /*
    public void increment(){
        synchronized (this) {
            counter++;
        }
    }
     */

    public synchronized void increment(){
            counter++;
    }


    public void work(){
        Thread t1 = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is: "+ counter);
    }

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        obj.work();
    }

}
