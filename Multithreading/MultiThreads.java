class MyRunnable implements Runnable{
  public void run(){
    for(int i=1;i<=10;i++){
      System.out.println("The thread running the job is "+Thread.currentThread().getName()+" i is "+ i);
    }
  }
}

class TestThread{
  public static void main(String[] args) {
    MyRunnable m = new MyRunnable();
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    Thread t3 = new Thread(m);
    t1.start();
    t2.start();
    t3.start();
    t1.start();

    System.out.println("all threads are terminated");
  }
}
