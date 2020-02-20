package Threading;

//  Write a program do to demonstrate the use of volatile keyword.

import java.util.Scanner;

class Process extends Thread{
    private volatile boolean flag = true;

    public void run(){
        while(flag){
            System.out.println("Foobar");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ender(){
        flag = false;
    }
}

public class Exercise1{
    public static void main(String[] args) {
        Process proc = new Process();
        proc.start();
        System.out.println("Press Enter to stop");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc.ender();
    }
}