package Multithreding;
class java {
    public void show() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Anroid
{
    public void show()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Anroid");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class TestDemo1 {
    public static void main(String[] args) {
        java obj1=new java();
        Anroid obj2=new Anroid();
        obj1.show();
        obj2.show();
    }
}
