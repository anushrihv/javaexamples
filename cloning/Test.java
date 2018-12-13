class Test implements Cloneable{
  final int var=10;

  // public Object clone() throws CloneNotSupportedException{
  //   return super.clone();
  // }

  public static void main(String[] args) throws CloneNotSupportedException{
    Test t = new Test();
    Test t2 = (Test) t.clone();
    System.out.println(t2.var);
  }
}
