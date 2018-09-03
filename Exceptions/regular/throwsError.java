import java.io.*;

class Test{

  void show() throws Error{
    System.out.println("error");
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.show();
  }
}
