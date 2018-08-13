public class test4{

  void show(String... a){
      System.out.println(a);
  }

  public static void main(String[] args){
    test4 t = new test4();
    t.show(null);
  }
}
