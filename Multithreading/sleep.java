class MyRunnable implements Runnable{
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("current thread is "+Thread.currentThread().getName());

    try{
      Thread.sleep(1000);
      
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
  }
}

class Test{
  public static void main(String[] args) {
    MyRunnable m = new MyRunnable();
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    Thread t3 = new Thread(m);

    t1.start();
    t2.start();
    t3.start();
  }
}
