//should always access static variables within static synchronised blocks

class Test{
  static int var=0;

  synchronized void modify(){
    for(int i=0;i<10;i++){
      var++;
    }
    System.out.println(var);
  }
}

class MyRunnable implements Runnable{

  public void run(){
      Test t = new Test();
      t.modify();
  }
}

class Main{
  public static void main(String[] args) {
    MyRunnable m = new MyRunnable();
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    t1.start();
    t2.start();
  }
}
