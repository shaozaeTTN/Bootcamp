package Threading;

//Write a program which creates deadlock between 2 threads

public class Exercise10 {
    public static void main(String[] args){
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized(resource1){
                    System.out.println("Thread 1: locked resource 1");

                    try{
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(resource2){
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };


        Thread t2 = new Thread(){
            public void run(){
                synchronized(resource2){
                    System.out.println("Thread 2: locked resource 2");

                    try{
                        Thread.sleep(50);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized(resource1){
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}