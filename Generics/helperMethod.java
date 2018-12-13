import java.util.*;

class Test{

  void setVal(List<?> l){
    setHelper(l);
  }

  private <T>void setHelper(List<T> l){
    l.set(0,l.get(0));
  }

  public static void main(String[] args) {
    Test t = new Test();
    List<Integer> al = new ArrayList<>();
    al.add(5);
    al.add(10);
    t.setVal(al);
  }
}
