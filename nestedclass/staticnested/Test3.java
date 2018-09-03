class Outer{
  static int var;
  class Inner{
    void show(){
      System.out.println("inner class"+var);
    }
  }
}

public class Test3{
  public static void main(String[] args) {
  Outer.Inner i = new Outer.Inner();
  }
}
