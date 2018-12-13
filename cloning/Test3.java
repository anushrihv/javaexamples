class A{
  int aa=20;
}

class Test implements Cloneable{
  static int var=10;
  A a = new A();

  public Object clone() throws CloneNotSupportedException{
    return super.clone();

  }
}

class Main{
  public static void main(String[] args) throws CloneNotSupportedException{
    Test t = new Test();
    Test t2 = (Test) t.clone();
    System.out.println(t2.var);
    System.out.println(t2.a.aa);
  }
}
