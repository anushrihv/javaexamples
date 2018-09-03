class Main{

  public static void main(String[] args) {

    Thread2 t = new Thread2();
    t.start();
    
    synchronized(t){
      try{
        t.wait();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
    System.out.println(t.total);
  }
}

class Thread2 extends Thread{
  int total;

  public void run(){
    synchronized(this){
      for(int i=1;i<=100;i++){
        total+=i;
      }
      notify();
    }
  }

}
