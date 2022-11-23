package Multithreding;
class Java extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Java");
            try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        }
    }
}
class Android extends Thread
{
    public void run()
    {
        printTenTimes();
    }
    private void printTenTimes() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Android");
            try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        }
    }
}
