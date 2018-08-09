class A{
  final int a;

  void modify(){
    a=10;
    a++;
  }

  public static void main(String args[]){
    A a = new A();
    a.modify();
    System.out.println(a);
  }
}
