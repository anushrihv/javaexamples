import java.util.concurrent.locks.*;

class Test{
    Lock lock = new ReentrantLock();
    int count=0;

    void increment(){
      try{
        lock.lock();
      count++;
    }catch(Exception e){
      System.out.println("exception occurred");
    }finally{
      lock.unlock();
    }
    }

    int value(){
      return count;
    }

    public static void main(String[] args) throws InterruptedException{
      Test t = new Test();
      Test test = new Test();
      Thread t1 = new Thread(t::increment);
      Thread t2 = new Thread(test::increment);
      Thread t3 = new Thread(t::increment);
      t1.start();
      t2.start();
      t3.start();
      Thread.sleep(2000);
      System.out.println("with t="+t.value());
      System.out.println("with test="+test.value());
    }

}
