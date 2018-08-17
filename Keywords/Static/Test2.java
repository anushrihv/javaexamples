class Test{
  static int a=20;

  static{
      System.out.println("before static block"+a);
    a=10;
      System.out.println("after static block"+ a);
  }


  static{
      System.out.println("second static " +a);
  }


  public static void main(String[] args) {
    System.out.println(a);
  }
}
