package Multithreding;

public class TestDemo7 {
    public static void main(String[] args) {
       new Thread(()->{
           for (int i=1;i<=10;i++);
           {
               System.out.println("java");
               try{ Thread.sleep(1000); }catch(InterruptedException e){ throw new RuntimeException(e);}
           }
       }).start();
    try{ Thread.sleep(1000); }catch(InterruptedException e){ throw new RuntimeException(e);}
           new Thread (()->{
        for (int i = 1; i <= 10; i++) ;
        {
            System.out.println("Anroid");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }).start();
}
}