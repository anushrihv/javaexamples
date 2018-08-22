//transient variables get their default values

import java.io.*;

class Dog implements Serializable{
  String name;
  transient Collar c;

  public Dog(String str,Collar collar){
    name=str;
    c=collar;
  }

}

class Collar{
  int size;

  public Collar(int size){
    this.size=size;
  }
}

class Main{
  public static void main(String[] args) {
    Collar c = new Collar(5);
    Dog d = new Dog("dog1",c);
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.txt"));
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.txt"));
        System.out.println("before writing "+ d.name+"has collar"+ c);
        os.writeObject(d);
        Dog d1=(Dog) is.readObject();
        System.out.println("after writing "+ d.name+"has collar "+d1.c);
      }catch(Exception e){
        e.printStackTrace();
      }

  }
}
