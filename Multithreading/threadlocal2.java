class Test{
  public static void main(String[] args) {
    ThreadLocal<Integer> id = new ThreadLocal<>();

    Thread t1 = new Thread(()->{
      id.set(1);
      System.out.println("Thread t1 id is "+id.get() );
    });

    Thread t2 = new Thread(()->{
      id.set(2);
      System.out.println("Thread t2 id is "+id.get() );
    });

    Thread t3 = new Thread(()->{
      id.set(3);
      System.out.println("Thread t3 id is "+id.get() );
    });

    Thread t4 = new Thread(()->{
      id.set(4);
      System.out.println("Thread t4 id is "+id.get() );
    });

    t1.start(); t3.start();
    t2.start(); t4.start();

  }
}
