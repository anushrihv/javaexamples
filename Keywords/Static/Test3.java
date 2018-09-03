 interface Parent{
  static void show(){
    System.out.println("within parent");
  }
}

class Child implements Parent{
  public void show(){
    System.out.println("within child");
  }
}

class Test{
  public static void main(String[] args) {
    Parent p = new Child();

  }


}
