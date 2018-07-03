import java.util.*;
class MyData
{
    int n, arr[];
    Random r = new Random();
    boolean newData=false;
    synchronized void input()
    {
        try
        {
            while(newData)
                wait();
                
            System.out.println("Enter input()");
            arr = new int[5];
            for(int i =0;i<5;i++)
            {
                arr[i] = Math.abs(r.nextInt()%1000000);
            }
            for(int i =0;i<5;i++)
            {
                System.out.println(arr[i]);
            }
            Thread.sleep(1000);
            newData = true;
            notify();
            System.out.println("Exiting input");
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    synchronized void getMin()
    {
        try
        {
            while(!newData)
                wait();
            System.out.println("Entering getMin()");
            int min = Integer.MAX_VALUE;
            for(int i =0;i<5;i++)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                }
            }
            newData = false;
            notify();
            System.out.println("MIN:" + min);
            
            Thread.sleep(1000);
            System.out.println("Exiting getMin()");
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
class MyRun1 implements Runnable
{
    MyData d;
    MyRun1(MyData d)
    {
        this.d = d;
    }
    public void run()
    {
        for(int i =0;i<10;i++)
        {
            d.input();
        }
    }
}
class MyRun2 implements Runnable
{
    MyData d;
    MyRun2(MyData d)
    {
        this.d = d;
    }
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            d.getMin();
        }
    }
}
class WaitNotify
{
    public static void main (String[] args) {
        MyData d = new MyData();
        MyRun1 r1 = new MyRun1(d);
        MyRun2 r2 = new MyRun2(d);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t2.start();
        t1.start();
    }
}