interface I{
  void show(String str);
}

class Test{
  public static void main(String[] args) {
    I i = System.out::println;
    i.show("hello");
  }
}
