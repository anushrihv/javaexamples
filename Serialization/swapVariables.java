import java.io.*;

class Test implements Serializable{
  int y;
  int x;
  String str=null;

  Test(int a,int b){
    System.out.println("constructor called");
    x=a;
    y=b;
  }

  public static void main(String[] args) {
    Test t = new Test(10,20);
    try{
        System.out.println("before writing "+ t.x+" "+t.y);

         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.txt"));
         os.writeObject(t);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.txt"));
        Test t2 = (Test) is.readObject();

        System.out.println("after reading "+t2.x+" "+t2.y);
      }
      catch(IOException io){
        io.printStackTrace();
      }
      catch(ClassNotFoundException fnf){
        fnf.printStackTrace();
      }

    }
}
