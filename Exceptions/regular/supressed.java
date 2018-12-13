import java.io.*;

class Resource1 implements Closeable{
  public void close(){
    throw new RuntimeException("resource1");
  }
}

class Resource2 implements Closeable{
  public void close(){
    throw new RuntimeException("resource2");
  }
}

class Test{
  public static void main(String[] args) {
    try(Resource1 r1 = new Resource1();Resource2 r2 = new Resource2()){
      throw new RuntimeException("within try");

    }catch(Exception e){
      Throwable[] exceptions = e.getSuppressed();
      for(Throwable t : exceptions){
        System.out.println(t);
    }
    }
  }
}
