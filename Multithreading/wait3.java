class Data{
  int var;
  String str;
}

class Thread1 extends Thread{
  Data d ;

  Thread1(Data d){
    this.d = d;
  }

  public void run(){
    synchronized(d){
      d.var=10;
      d.str="Hello";
      System.out.println("calling notify");
      d.notify();

    }
  }

}

class Thread2 extends Thread{
  Data d;

  Thread2(Data d){
    this.d = d;
  }

  public void run(){
    synchronized(d){
      try{
        d.wait();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
    System.out.println(d.var+" "+d.str);
  }

}

class Test{
  public static void main(String[] args) {
    Data d = new Data();
    Thread1 t1 = new Thread1(d);
    Thread2 t2 = new Thread2(d);
    t1.start();
    t2.start();

  }
}
