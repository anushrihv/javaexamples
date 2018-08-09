class Test{
  final int var;
  Test(){
    this(5);
    var=10;
  }
  Test(int a){
    var=a;
  }

  public static void main(String args[]){
    Test t = new Test();
  }
}
