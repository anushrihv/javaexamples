//if the parent class has a static method and the child class has the same method which is non static

class A{
  public static void show(){
    System.out.println("within A");
  }
}

class B extends A{
  public void show(){
    System.out.println("within B");
  }
}

public class test2{
  public static void main(String[] args) {
    A a = new B();
    a.show();
  }
}
