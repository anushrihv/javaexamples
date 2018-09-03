class Main{
  public static void main(String[] args) {
    Thread1 t1 = new Thread1();
    t1.start();

    synchronized(t1){
      try{
        System.out.println("before waiting");
        t1.wait();
      }catch(InterruptedException e){
        e.printStackTrace();
      }

    }
    System.out.println(t1.total);
  }
}

class Thread1 extends Thread{
  int total;
  public void run(){
    synchronized(this){
      System.out.println("calculating total");
      for(int i=0;i<10;i++){
        total+=i;
      }
    }
  }
}
