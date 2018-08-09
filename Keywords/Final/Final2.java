class Test{
  final int a;
  Test(){
    a=10;
    System.out.println(a);
  }
  Test(int b){
    System.out.println("Hello");
    a=b;
  }
  Test(String str){
    System.out.println("not initializing final var");
  }

  public static void main(String args[]){
    Test t = new Test();
  }
}
