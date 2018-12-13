class Test{
  private static int count=0;

  public static synchronized void increment(){
    count++;
  }

  public static synchronized int get(){
    return count;
  }

  public static void main(String[] args) throws InterruptedException{

    MyRunnable r = new MyRunnable();
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    Thread t3= new Thread(r);
    Thread t4 =new Thread(r);
    t1.start(); t2.start(); t3.start(); t4.start();
    Thread.sleep(1000);
    System.out.println(Test.get());
  }
}

class MyRunnable implements Runnable{
 public void run(){
    Test.increment();
  }
}
