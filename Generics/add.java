import java.util.*;

class Test{

  void add(List<?> l){
    l.add(new Integer(5));
  }

  public static void main(String[] args) {
    Test t = new Test();
    List<Integer> l = new ArrayList<>();
    t.add(l);
  }
}
