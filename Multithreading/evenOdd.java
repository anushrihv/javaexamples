class Num{
  int i=0;
}

class Thread1 extends Thread{
  Num n;

  Thread1(Num n){
    this.n = n;
  }
  public void run(){
    for(int index=0;index<10;index++){

      synchronized(n){

            System.out.println(n.i++ + Thread.currentThread().getName());
            try{
              n.wait();
            }catch(InterruptedException e){
              e.printStackTrace();
            }
            n.notify();
      }
    }
  }
}

class Thread2 extends Thread{
  Num n ;

  Thread2(Num n){
    this. n = n;
  }
  public void run(){

        for(int index=0;index<10;index++){

            synchronized(n){

              System.out.println(n.i++ + Thread.currentThread().getName());
              n.notify();
              try{
                n.wait();
              }catch(InterruptedException e){
                e.printStackTrace();
              }


          }
    }
  }
}

class Test{
  public static void main(String[] args) {
    Num n = new Num();
    Thread1 t1 = new Thread1(n);
    Thread2 t2 = new Thread2(n);
    t1.start();
    t2.start();

  }
}
