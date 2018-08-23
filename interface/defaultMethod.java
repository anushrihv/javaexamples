interface B{
  int a=100;
  default void show(){
    System.out.println("within interface B "+a);
  }
}

interface A {
  int a=200;
  default void show(){
    System.out.println("within interface A ");
  }
}

abstract class C{
  int a=300;
}

class Test extends C implements A,B {



  public static void main(String[] args) {
    
  }
}
