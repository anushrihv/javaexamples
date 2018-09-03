import java.io.*;

class Test1 implements AutoCloseable{
  public void close() throws FileNotFoundException{
    throw new FileNotFoundException();
  }
}

class Test2 implements AutoCloseable{
  public void close() throws NoSuchMethodException{
    throw new NoSuchMethodException();
  }
}

class Main{
  public static void main(String[] args) throws NoSuchMethodException,IOException,FileNotFoundException{

    try(Test1 t1 = new Test1(); Test2 t2 = new Test2() ) {

    }catch(Exception e ){
      e.printStackTrace();
      for(Throwable t:e.getSuppressed()){
        System.out.println(t);
      }
    }
  }
}
