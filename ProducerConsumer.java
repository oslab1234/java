class GetPut
{
 int n;
 boolean Empty=true;
 synchronized int get()
 {
 if(Empty)
 {
 try
 {
 wait();
 }
 catch(InterruptedException e)
 {
 System.out.println("Interrupted Exception in Threa
d caught");
 }
 }
 System.out.println("Consumed element :" +n);
 Empty=true;
 notify();
 return n;
 }
 synchronized void put(int n)
 {
 if(!Empty)
 {
 try
 {
 wait();
 }
 catch(InterruptedException e)
 {
 System.out.println("Interrupted Exception in Threa
d caught");
 }
 }
 this.n=n;
 Empty=false;
 System.out.println("Produced element :"+n);
 notify();
 }
}
class Producer implements Runnable
{
 GetPut ob;
 Producer(GetPut ob)
 {
 this.ob=ob;
 new Thread(this,"Producer").start(); 
 }
 public void run()
 {
 int i=0;
 while(i<10)
 ob.put(++i);
 }
}
class Consumer implements Runnable
{
 GetPut ob;
 Consumer(GetPut ob)
 {
 this.ob=ob;
 new Thread(this,"Consumer").start();
 }
 public void run()
 {
 int i=0;
 while(i<10)
 {
 ob.get();
 i++;
 }
 }
}
public class ProducerConsumer
{
 public static void main(String args[])
 {
 GetPut ob=new GetPut();
 new Producer(ob);
 new Consumer(ob);
 }
}
