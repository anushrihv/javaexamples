import java.io.*;

class Test{
  public static void main(String[] args) {
    try{
      throw new IOException();
    }catch(IOException e){
      System.out.println("caught");
      log(e);
    }
  }
}
