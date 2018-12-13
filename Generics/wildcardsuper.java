import java.util.*;

class Test{

  void fun(List<? super Number> l){
    l.add(new Integer(5));
  }

  public static void main(String[] args) {
    List<? super Integer> l1 = new ArrayList<>();





    new Test().fun(l1);
  }
}
