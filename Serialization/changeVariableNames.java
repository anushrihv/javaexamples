//changevariable names---> SV UID changes
//swapping the order of variables----> nothing happens

import java.io.*;

class Test implements Serializable{

  int a;
  int b;
  int c;

  Test(int a,int b){
    this.a = a;
    this.b = b;
  }
}

class TestSerialize{
  public static void main(String[] args) {
    Test t = new Test(10,20);
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        System.out.println("before writing "+t.a+" "+t.b);
        os.writeObject(t);
      }
      catch(IOException io){
        io.printStackTrace();
      }
  }
}

class TestDeserialize{
  public static void main(String[] args) {
    try{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
        Test t2 = (Test) is.readObject();
        System.out.println("after reading "+t2.a+" "+t2.b);
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
