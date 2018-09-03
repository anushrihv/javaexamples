//creating a deadlock

class A{
  synchronized void show(B b){
    for(int i=0;i<100;i++){
      if(i==50) b.show(this);
      System.out.println("within A");
    }
  }
}

class B{
  synchronized void show(A a){
    for(int i=0;i<100;i++){
      if(i==50) a.show(this);
      System.out.println("within B");
    }
  }
}

class MyRunnable implements Runnable{
  A a = new A();
  B b = new B();
  public void run(){
    if(Thread.currentThread().getName().equals("Thread-0")) a.show(b);
    else b.show(a);
  }
}

class Test{
  public static void main(String[] args) {
    MyRunnable m = new MyRunnable();
    Thread t1 = new Thread(m);
    Thread t2 = new Thread(m);
    t1.start();
    t2.start();
  }
}
