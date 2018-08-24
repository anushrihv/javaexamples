import java.io.*;

class Outer implements Serializable{
  int a=10;
  class Inner extends Outer implements Serializable{
    int b=20;

    void modify(){
      a++;
      b++;
    }

    void displayA(){
      System.out.println(a);
    }
  }
}

class TestSer{
  public static void main(String[] args) {
    Outer.Inner i = new Outer().new Inner();
    i.modify();
    i.displayA();
    System.out.println("before serialization "+i.b);
    try{
      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
      os.writeObject(i);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}

class TestDe{
  public static void main(String[] args) {
    try{
      ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
      Outer.Inner i2=(Outer.Inner) is.readObject();
      System.out.println("after reading a and b"+ i2.a + " "+i2.b);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
