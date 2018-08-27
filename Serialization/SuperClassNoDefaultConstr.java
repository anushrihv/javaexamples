//a super class that does not implements serializable has to provide a no arg constructor in case it has a parameterised ocnstructor only.
//or else jvm will add one.

import java.io.*;

class Super1{
  int x=10;

}

class Super2 extends Super1{
  int a;

  Super2(){

  }

  Super2(int val){''
    a=val;
  }
}

class Test extends Super2 implements Serializable{
  int b=100;

  Test(){
    super(20);
  }
}

class TestSe{
  public static void main(String[] args) {
    Test t = new Test();
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        System.out.println("before writing "+t.b );
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
        Object o= is.readObject();
        System.out.println("after reading "+o.getClass().getName());
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
