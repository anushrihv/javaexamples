class MyThread extends Thread{
  public void run(){
    for(int i=0;i<1000;i++){

    }
    if(Thread.interrupted()){
      System.out.println("interrupt flag cleared");
    }
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
      System.out.println("exception thrown");
    }
    System.out.println("sleep time over");
  }
}

class Test{
  public static void main(String[] args) {
    MyThread m = new MyThread();
    m.start();
    m.interrupt();
  }
}
