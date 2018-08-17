public class Varargs{
  void show(int... a){
    System.out.println("int varargs");
  }

  void show(byte... a){
    System.out.println("byte varargs");
  }

  public static void main(String[] args) {
    Varargs v = new Varargs();
    v.show();
  }
}
