public class Test{
  private int i=10;

  void show(Test t){
    System.out.println(t.i);
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.show(t);
  }
}
