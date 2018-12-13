class A{
  static void show(){
    System.out.println("in A");
  }
}

class B extends A{
  static void show(){
    System.out.println("in B");
  }
}

class Main{
  public static void main(String[] args) {
    A a = new B();
    a.show();
  }
}
