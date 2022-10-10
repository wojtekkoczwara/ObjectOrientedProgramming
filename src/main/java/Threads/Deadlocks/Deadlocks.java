package Threads.Deadlocks;

public class Deadlocks {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    private static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1 has lock1");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread1: Waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread1: has lock1 and lock2");
                }
                System.out.println("Thread1 : released lock 2");
            }
            System.out.println("Thread 1: Released lock1, exiting");

        }
    }

    private static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 2 has lock1");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
                System.out.println("Thread2: Waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread2: has lock1 and lock2");
                }
                System.out.println("Thread2 : released lock 2");
            }
            System.out.println("Thread 2: Released lock1, exiting");

        }
    }
}


