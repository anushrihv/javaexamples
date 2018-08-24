//the objects should be Deserialized in the same order in which it was written

import java.io.*;

class A implements Serializable{
  int a,b;

  A(int a,int b){
    this.a = a;
    this.b = b;
  }
}

class B implements Serializable{
  String a,b;

  B(String a,String b){
    this.a = a;
    this.b = b;
  }
}

class TestSerialize{
  public static void main(String[] args) {
    A a = new A(10,20);
    B b = new B("first","second");
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        System.out.println("before writing A"+a.a+" "+a.b);
        System.out.println("before writing B"+b.a+" "+b.b);
        os.writeObject(a);
        os.writeObject(b);
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
        B b2 = (B) is.readObject();
        A a2 = (A) is.readObject();
        System.out.println("after reading A "+a2.a+" "+a2.b);
        System.out.println("after reading B "+b2.a+" "+b2.b);
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
