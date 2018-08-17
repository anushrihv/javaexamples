class Outer{
  static class Inner{
    void show(){
      System.out.println("inner class");
    }
  }
}

public class Test3{
  public static void main(String[] args) {
    Outer.Inner i = new Outer.Inner();
    i.show();
  }
}
