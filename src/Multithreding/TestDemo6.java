package Multithreding;

public class TestDemo6 {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            for (int i=1;i<=10;i++)
            {
                System.out.println("java");
                try {Thread.sleep(50);} catch (InterruptedException e) {throw new RuntimeException(e);
                }
            }
        });
        Thread thread2=new Thread (()-> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Android");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);}
                }
            });
        thread1.start(); //to start thread
            try {Thread.sleep(50);} catch (InterruptedException e) {throw new RuntimeException(e);}
            thread2.start();
       }
    }

