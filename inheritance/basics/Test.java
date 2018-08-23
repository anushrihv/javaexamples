class A{
  int a=100;
  void show(){
    System.out.println("within A " + a);
  }
}

class B extends A{

  void show(){
    a++;
    super.show();
    System.out.println("within B "+a);
  }

  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
