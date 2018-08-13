class A{
  void fun(int a){
    System.out.println("within A "+ a);
  }
}

class B extends A{
  void fun(Integer a){
    System.out.println("within B "+a);
  }

  
}

public class test{
  public static void main(String args[]){
    B b = new B();
    b.fun(5);
  }
}
