import java.io.*;

class AnotherResource implements Closeable{
  public void close(){
    System.out.println("within close of AnotherResource");
  }
}

class Resource implements AutoCloseable{
  AnotherResource a = new AnotherResource();
  public void close(){
    a.close();
    System.out.println("close called");
  }
}

class Test{
  public static void main(String[] args) {
    try(Resource r = new Resource()){
        System.out.println("within try with resources");
    }
  }
}
