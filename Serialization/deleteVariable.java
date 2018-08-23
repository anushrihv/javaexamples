//if you delete a variable after serialization, then it gives a runtime error saying "invalidClassException: local class incompatible"

import java.io.*;

class Test implements Serializable{
  int x;
  int y;

  Test(int a,int b){
    x=a;
    y=b;
  }

  public static void main(String[] args) {
    Test t = new Test(10,20);
    try{
        System.out.println("before writing "+ t.x+" ");

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.txt"));
        os.writeObject(t);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.txt"));
        Test t2 = (Test) is.readObject();

        System.out.println("after reading "+t.x+" ");
      }
      catch(IOException io){
        io.printStackTrace();
      }
      catch(ClassNotFoundException fnf){
        fnf.printStackTrace();
      }

    }
}
