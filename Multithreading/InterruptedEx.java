//interrupt method can be used to make a thread throw interrupted exception

class Myrunnable implements Runnable{
  public void run(){
    try{
      Thread.sleep(5000);

    }catch(InterruptedException e){
      System.out.println("Interrupted");
    }
  }
}

class Test{
  public static void main(String[] args) {
    Myrunnable m = new Myrunnable();
    Thread t = new Thread(m);
    t.start();
    t.interrupt();

  }
}
