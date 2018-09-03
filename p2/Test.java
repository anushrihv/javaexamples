package p2;
import p1.*;

class Test extends Outer{

  void createInner(){
    Outer o = new Outer();

    Outer.Inner i = o.new Inner();
    System.out.println(i.var);
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.createInner();
  }
}
