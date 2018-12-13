import java.util.concurrent.*;

class MyRunnable implements Runnable{
  String command;

  MyRunnable(String command){
    this.command = command;
  }

  public void run(){
    System.out.println(Thread.currentThread().getName()+" started command="+command);
    processCommand();
    System.out.println(Thread.currentThread().getName()+" stopped command="+command);
  }

  public void processCommand(){
    try{
      Thread.sleep(1000);
    }catch(InterruptedException e){
      System.out.println("interrupted");
    }
  }
}

class Test{
  public static void main(String[] args) {
    Executor e = Executors.newFixedThreadPool(5);
    for(int i=0;i<10;i++){
      e.execute(new MyRunnable(""+i));
    }
    //e.shutdown();
  }
}
