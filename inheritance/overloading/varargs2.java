class Test{
  void shoow(int a, int... arr){
    System.out.println("varargs");
  }
  void shoow(int[] arr){
    System.out.println("array");
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.shoow(1, new int[]{1,2} );
  }
}
