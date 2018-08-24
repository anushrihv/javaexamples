import java.io.*;

class Another {
  int x=10;
}

class Test implements Serializable{
  int a=100;
  int b=200;
  transient Another obj = new Another();

  private void writeObject(ObjectOutputStream os){
    try{

      os.defaultWriteObject();
      os.writeInt(obj.x);
    }catch(Exception e){
      System.out.println("within custom writeObject");
      e.printStackTrace();
    }
  }

  private void readObject(ObjectInputStream is){
    try{
      
      is.defaultReadObject();
      obj=new Another();
      obj.x=is.readInt();
    }catch(IOException i){
      i.printStackTrace();
    }catch(ClassNotFoundException c){
      c.printStackTrace();
    }
  }

}

class MainSer{

  public static void main(String[] args) {

    Test t = new Test();

    System.out.println("a,b,x values are "+t.a+" "+t.b+" "+t.obj.x);
    try{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));
        os.writeObject(t);
      }
      catch(IOException i){
        i.printStackTrace();
      }

  }
}

class MainDe{


  public static void main(String[] args) {
    try{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
        Test t2 = (Test) is.readObject();
        System.out.println("a,b,x values are "+t2.a+" "+t2.b+" "+t2.obj.x);
      }catch(ClassNotFoundException c){
        c.printStackTrace();
      }catch(IOException io){
        io.printStackTrace();
      }
  }
}
