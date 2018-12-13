import java.util.*;

class Test{

  void setVal(List<?> l){
    System.out.println(l);
  }

  public static void main(String[] args) {
    Test t = new Test();
    List al = new ArrayList();
    t.setVal(al);
  }
}
