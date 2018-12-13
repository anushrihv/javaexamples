import java.util.concurrent.locks.*;
import java.util.*;

class Test{
  LinkedList<Integer> list = new LinkedList<>();
  ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  Lock lock1 = lock.readLock();
  Lock lock2 = lock.writeLock();

  void add(int var){
    lock2.lock();
    list.add(var);
    lock2.unlock();
  }

  int read(){
    lock1.lock();
    Integer val = list.poll();
    lock1.unlock();
    return val;
  }

  public static void main(String[] args) {
    Test t = new Test();
    Thread t1 = new Thread(()->{for(int i=0;i<50;i++){
      t.add(i);
    }});

    Thread t2 = new Thread(()->{for(int i=0;i<50;i++){
      System.out.println(t.read());
    }});

    t1.start();
    t2.start();
  }

}
