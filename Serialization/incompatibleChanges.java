

import java.io.*;

class Test implements Serializable{

  private static final long serialVersionUID = 42l;

  transient static String str="abc";
  long a;

  Test(int a){
    this.a = a;

  }
}

class TestSe{
  public static void main(String[] args) {
    Test t = new Test(100);
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        System.out.println("before writing "+ t.a );
        os.writeObject(t);
      }
      catch(IOException io){
        io.printStackTrace();
      }
  }
}

class TestDe{
  public static void main(String[] args) {
    try{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
        Test t2=(Test) is.readObject();
        System.out.println("after reading "+t2.a);
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
