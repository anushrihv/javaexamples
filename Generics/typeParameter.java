import java.util.*;

class Test{

  <T>void fun(List<T> l){
    for(T e : l){
      System.out.print(e+" ");
    }
  }

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(5); l.add(10);
    new Test().fun(l);
  }
}
