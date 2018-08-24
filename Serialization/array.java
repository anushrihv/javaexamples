

import java.io.*;

class Animal{

}

class Dog extends Animal implements Serializable{

}

class Test {
  public static void main(String[] args) throws FileNotFoundException,IOException{
    Animal[] a = new Animal[3];
    a[0]=new Dog();
    a[1]=new Dog();
    a[2]=new Animal();

    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
    os.writeObject(a);
  }
}
