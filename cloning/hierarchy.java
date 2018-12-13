class A {
  // public Object clone() throws CloneNotSupportedException{
  //   return super.clone();
  // }
}

class B extends A {
  int var;
  // public Object clone() throws CloneNotSupportedException {
  //   return super.clone();
  // }
}

class C extends B implements Cloneable{
  int a=10;
  final int b=20;


  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }
}

class Test2{
  public static void main(String[] args)  throws CloneNotSupportedException{

    C obj = new C();


    C obj2 = (C) obj.clone();

    System.out.println(obj2.a+" "+obj2.b);
  }
}
