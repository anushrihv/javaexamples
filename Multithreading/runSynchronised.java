class Test{
  //
  // synchronized void display() {
  //   show();
  //   try{
  //     Thread.sleep(10000);
  //   }catch(InterruptedException e){
  //     e.printStackTrace();
  //   }
  //   show2();
  // }

  void show(){
    System.out.println("within show "+Thread.currentThread().getName());
  }

  void show2(){
    System.out.println("within show2 "+Thread.currentThread().getName());
  }
}

class MyRunnable implements Runnable{
  Test t = new Test();
  public synchronized void run(){

    t.show();
    try{
      Thread.sleep(3000);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    t.show2();
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
