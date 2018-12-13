class Test{
  ThreadLocal<String> str = new ThreadLocal<String>();
  ThreadLocal<Number> num = new ThreadLocal<Number>();
  String normalstr ;
}

class Main{
  public static void main(String[] args) {

    Test t = new Test();

    Thread t1 = new Thread(new Runnable(){
      public void run(){
        t.normalstr = new String("string created");
        System.out.println("normal string value in 1 "+t.normalstr);
        t.str.set("First thread");
        System.out.println(t.str.get());
        t.num.set(100);
        System.out.println(t.num.get());
      }
    });

    Thread t2 = new Thread(new Runnable(){
      public void run(){
        System.out.println("normal string value in 2 "+t.normalstr);
        System.out.println("printing initial value of str"+t.str.get());
        System.out.println("printing initial value of num"+t.num.get());
        //t.str.set("Second thread");
        System.out.println(t.str.get());
        //t.num.set(200);
        System.out.println(t.num.get());
      }
    });

    t1.start();
    t2.start();
  }
}
