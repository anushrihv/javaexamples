import java.util.*;

class Test{

  void fun(List<T> l){
    System.out.println(l);
  }

  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>();
    List<Object> l2 = new ArrayList<>();

    new Test().fun(l1);
    new Test().fun(l2);
  }
}
