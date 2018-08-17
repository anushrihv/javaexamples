class Super{
  void show(){
    System.out.println("within super");
  }
}

class Sub extends Super{
  void show(){
    System.out.println("within super");
    super.display();
  }

  public static void main(String[] args) {
    Sub s = new Sub();
    s.show();
  }
}
