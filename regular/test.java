interface A{
  static void show(){
    System.out.println("interface A");
  }
}

class B implements A{

  static void show(){
    System.out.println("class B");
  }

  public static void main(String[] args) {
    A a = new B();
    B.show();
  }
}
