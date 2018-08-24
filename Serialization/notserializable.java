//NotSerialiazable exception is thrown by writeObject

import java.io.*;

class Dog implements Serializable{
  String name;
}

class Test{
  public static void main(String[] args) {
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));

        os.writeObject(new Dog());
      }
      catch(IOException e){
        e.printStackTrace();
      }

  }
}
