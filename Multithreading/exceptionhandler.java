class Main{
  public static void main(String[] args) {
    Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler(){
      public void uncaughtException(Thread t , Throwable e){
        System.out.println("thread "+t.getName()+" throws "+e.getMessage());
      }
    };

    Thread t1 = new Thread(()->{throw new RuntimeException("thread 1");});

    Thread t2 = new Thread(()->{throw new RuntimeException("thread 2");});

    // t1.setUncaughtExceptionHandler(handler);
    // t2.setUncaughtExceptionHandler(handler);

    Thread.setDefaultUncaughtExceptionHandler(handler);

    t1.start();
    t2.start();
  }
}
