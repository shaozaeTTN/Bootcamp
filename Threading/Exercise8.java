package Threading;

class Semaphore{
    private static Semaphore semaphore;
    private static int resource = 1;

    private Semaphore(){}

    public synchronized void increment(){
        while(isAvailable()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        resource += 1;

        report();

        this.notifyAll();
    }

    public synchronized void decrement(){
        while(!isAvailable()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        resource -= 1;

        report();

        this.notifyAll();
    }

    public synchronized final static boolean isAvailable(){
        return resource == 1 ? true : false;
    }

    public synchronized final static void report(){
        System.out.println("Resource value: " + resource);
    }

    public final static Semaphore getInstance(){
        if(semaphore == null){
            semaphore = new Semaphore();
        }
        return semaphore;
    }
}

class Incrementer implements Runnable {
    private static Semaphore semaphore = null;

    public Incrementer(Semaphore s) {
        semaphore = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Incrementing...");
            semaphore.increment();
        }
    }
}


class Decrementer implements Runnable{
    private static Semaphore semaphore = null;

    public Decrementer(Semaphore s) {
        semaphore = s;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Decrementing...");
            semaphore.decrement();
        }
    }
}


public class Exercise8 {
    public static void main(String[] args){
        Thread iIncrement = new Thread(new Incrementer(Semaphore.getInstance()));
        Thread iDecrement = new Thread(new Decrementer(Semaphore.getInstance()));

        iIncrement.start();
        iDecrement.start();
    }
}

