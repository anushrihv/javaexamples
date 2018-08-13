class A{
  int add(int a ,int b){
    return a+b;
  }
}

class B extends A{
  double add(int a, int b){
    return a+b;
  }
}

public class test1{
  public static void main(String[] args){
    A a = new B();
    System.out.println(a.add(2,3));
  }
}
