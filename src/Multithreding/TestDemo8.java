package Multithreding;


public class TestDemo8 {
    public static void main(String[] args) {

        Thread thread1=new Thread(()-> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Java");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        },"Java Thread");

        Thread thread2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Android");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        },"Android Thread");

     thread1.setName("Java Thread");
        thread2.setName("Android Thread");
        System.out.println("thread1.getname");
        System.out.println("thread2.getname");

        System.out.println("Thread priorities:");
        System.out.println(thread1.getPriority());//normal priorities
        System.out.println(thread2.getPriority());

        thread1.setPriority(1);
        System.out.println("Java Thread Priority is "+thread1.getPriority());
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Java Thread Priority is MAX  "+thread1.getPriority());
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Java Thread Priority is NORM  "+thread1.getPriority());
        thread1.setPriority(Thread.NORM_PRIORITY);







    }
}