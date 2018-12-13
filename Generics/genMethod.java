class Test<T>{
  T var;

  public Test(T var){
    this.var = var;
  }

  void show(){
    System.out.println(var);
  }

  public static void main(String[] args) {
    Test t = new Test("Hello");
    t.show();
  }
}
