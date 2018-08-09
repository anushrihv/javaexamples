//overriding static members

class Parent{
  static void show(){
    System.out.println("within parent");
  }

  public static void main(String[] args) {
    Child p = new Child();
    p.show();
  }
}

class Child extends Parent{
  static void show(){
    System.out.println("within child");
  }


}
