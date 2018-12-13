class Test{
  public static synchronized void show(){
    for(int i=0;i<5;i++){
    System.out.println("static method 1");
  }
  }

  public static synchronized void show1(){
    for(int i=0;i<5;i++){
    System.out.println("static method 2");
  }
  }

  public synchronized void show2(){
    for(int i=0;i<5;i++){
    System.out.println("instance method ");
  }
  }

  public static void main(String[] args) {
    Test t = new Test();
    Thread t1 = new Thread(Test::show);
    Thread t2 = new Thread(Test::show1);
    Thread t3 = new Thread(t::show2);
    t1.start();
    t2.start();
    t3.start();
  }
}
