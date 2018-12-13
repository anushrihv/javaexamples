import java.util.*;

class Producer extends Thread{
  Resource r;

  Producer(Resource r){
    this.r = r;
  }

  public void run(){
    try{
      r.produce();
    }catch(InterruptedException e){
      System.out.println("interrupted");
    }
  }
}

class Consumer extends Thread{
  Resource r;

  Consumer(Resource r){
    this.r = r;
  }

  public void run(){
    try{
      r.consume();
    }catch(InterruptedException e){
      System.out.println("interrupted");
    }
  }
}

class Resource{
  List<String> list = new ArrayList<>();

  int i=100; int j=100; int capacity =5;
  public static void main(String[] args) throws InterruptedException{
      Resource r = new Resource();
      Producer p = new Producer(r);
      Consumer c = new Consumer(r);
      p.start();
      c.start();
      p.join();
      c.join();
  }

  public void produce() throws InterruptedException{
    synchronized(this){
      while(i-->0){
        while(list.size()==capacity){
          wait();
        }
        list.add("some string");
        notify();
        Thread.sleep(1000);
      }
    }
  }

  public void consume() throws InterruptedException{
    synchronized(this){
      while(i-->0){
        while(list.size()==0){
          wait();
        }
        String str = list.get(0);
        System.out.println(str);
        notify();
        Thread.sleep(1000);
      }
    }
  }
}
