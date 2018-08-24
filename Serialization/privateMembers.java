//

import java.io.*;

class Dog implements Serializable{
  private String name;
  

  private Dog(String str){
    name=str;
  }
}

class Test{
  public static void main(String[] args) {
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));


        os.writeObject(new Dog("beagle"));

        Dog d = (Dog)is.readObject();

      }
      catch(IOException e){
        e.printStackTrace();
      }
      catch(ClassNotFoundException c){
        c.printStackTrace();
      }

  }
}
