interface A{
  void show();
}

interface B extends A{
  int show();
}

class Test implements B{


  public static void main(String[] args) {
    Test t = new Test();

  }
}
