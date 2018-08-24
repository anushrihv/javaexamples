//if a superclass is not Serializable, the instance variables of the subclass are serialized .
//during deserialization, the subclass is deserialized normally and the superclass is initialised using a constructor. 

import java.io.*;

class A{
  int a=100;

  void modify(){
    a+=500;
  }
}

class B extends A implements Serializable{
  int b=200;

  void modifyB(){
    b+=500;
  }
}

class TestSe{
  public static void main(String[] args) {

    B b = new B();
    b.modify();
    b.modifyB();

    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        System.out.println("before writing A="+ b.a+" B="+b.b );
        os.writeObject(b);
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
        B b2=(B) is.readObject();
        System.out.println("after reading "+b2.a+" "+b2.b);
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
