class MyRunnable implements Runnable{
  public void run(){
    for(int i=0;i<20;i++){
      System.out.println(i*10);
    }
  }
}

class Test{
  public static void main(String[] args) {
    MyRunnable m = new MyRunnable();
    Thread t = new Thread(m);
    //Thread.currentThread().setPriority(10);
    t.start();
    try{
      t.join();
    }catch(InterruptedException i){
      i.printStackTrace();
    }
    for(int i=0;i<20;i++){
      System.out.println(i);
    }
  }
}
