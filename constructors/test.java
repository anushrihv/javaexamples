class Test{
  Test(){
    add(10,20);
  }

  void add(int a,int b){
    System.out.println(a+b);
  }
  public static void main(String[] args) {
    Test t = new Test();
  }
}
