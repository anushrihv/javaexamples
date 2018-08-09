class A{
  void show(){
    System.out.println("within A");
  }
}

class B extends A{
  void show(){
    System.out.println("within B");
  }
}

public class Test extends B{
  public static void main(String args[]){
    Test t = new Test();
    t.fun();
  }

  void fun()
  {
    show();
  }
}
