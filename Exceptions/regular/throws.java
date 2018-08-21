//the exception must be caught or thrown

import java.io.*;

class Test{

  void show() throws FileNotFoundException,IOException{
    FileInputStream fin = new FileInputStream("");
    int a = fin.read();
  }

  public static void main(String[] args) throws FileNotFoundException,IOException {
    Test t = new Test();

    t.show();


  }
}
