package Threads;

import static Threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== another one ===");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another thread terminated, so I'm running again");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED + "Icouldn't wait after all. I was interrupter");
                }
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

//        anotherThread.interrupt();
        System.out.println(ANSI_PURPLE + "Hello from main thread again");



    }
}
