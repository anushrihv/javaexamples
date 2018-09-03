import java.io.*;

class Animal implements AutoCloseable{
  public void close(){
    System.out.println("closing");
  }
}

class Test{
  public static void main(String[] args) {
    try(Animal a = new Animal();){

    }
    finally{
      System.out.println("within finally");
    }
  }
}
