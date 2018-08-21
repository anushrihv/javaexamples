class Test{

  void show(long a,Long b){
    System.out.println("long,long");
  }

  void show(Long a,long b){
    System.out.println("Long,Long");
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.show(1l,1);
  }
}
