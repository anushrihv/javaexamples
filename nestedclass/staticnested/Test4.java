class Outer{
  static class Inner{
    int var=20;
    static int val=30;
  }

  public static void main(String[] args) {
    Inner i = new Inner();
    System.out.println(i.var);
    System.out.println(Inner.val);
  }
}
