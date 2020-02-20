package Threading;

/*Write a program to create a Thread pool of 2 threads where one
Thread will print even numbers and other will print odd numbers.
 */

class OddEven {

    private static int count = 1;
    private static int MAX = 10;
    private Object obj = new Object();

    public void printEven() {
        while (true) {
            if (count > MAX) break;
            synchronized (obj) {
                System.err.println(Thread.currentThread().getName() + " : " + count++);
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) { }
            }
        }
    }

    public void printOdd() {
        while (true) {
            if (count > MAX) break;
            synchronized (obj) {
                System.err.println(Thread.currentThread().getName() + " : " + count++);
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) { }
            }
        }
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        OddEven p = new OddEven();

        // Thread t1 = new Thread(() -> p.printEven());
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printEven();
            }
        });
        t1.setName("EVEN");

        // Thread t2 = new Thread(() -> p.printOdd());
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                p.printOdd();
            }
        });
        t2.setName("ODD");

        t1.start();
        t2.start();
    }

}