class A {
  // public Object clone() throws CloneNotSupportedException{
  //   return super.clone();
  // }
}

class B extends A {
  // public Object clone() throws CloneNotSupportedException {
  //   return super.clone();
  // }
}

class C extends B implements Cloneable{
  int a,b;
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}

class Test2{
  public static void main(String[] args)  throws CloneNotSupportedException{

    C obj = new C();
    obj.a=10;
    obj.b=20;
    C obj2 = (C) obj.clone();
    System.out.println(obj==obj2);
  }
}
