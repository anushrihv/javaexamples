import java.util.concurrent.*;

class Test{
  public static void main(String[] args) throws Exception{
    ThreadPoolExecutor executor =
  (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
executor.submit(() -> {
    System.out.println("first");
    return null;
});
executor.submit(() -> {
    System.out.println("second");
    return null;
});
executor.submit(() -> {
    System.out.println("third");
    return null;
});

int poolSize = executor.getPoolSize();
System.out.println("poolsize=" + poolSize);

executor.shutdown();
  }
}
