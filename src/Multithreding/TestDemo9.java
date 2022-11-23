package Multithreding;

public class TestDemo9 {
    private synchronized void printOddnumber() throws InterruptedException{
        for (int i=1;i<=50;i++)
        {
            if(i%2!=0)
            {
                System.out.println(Thread.currentThread().getName()+":GoodMorning");
                Thread.sleep(1000);
            }
            wait();
        }
        notify();
    }

    private synchronized void printEvennumber() throws InterruptedException {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":GoodEvening");
                Thread.sleep(100);
            }
            wait();
        }
        notify();
    }

    public static void main(String[] args) {
    TestDemo9 t9=new TestDemo9();
    Thread thread1=new Thread(()->{
        try{
            t9.printEvennumber();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    },"odd");

        Thread thread2=new Thread(()->{
            try{
                t9.printEvennumber();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        },"Even");
        thread1.start();
        thread2.start();
    }

    }