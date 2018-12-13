import java.util.*;

class Test{

  void fun(List<? extends Number> l){
    double sum=0;
    for(Number n : l){
      sum+=n.doubleValue();
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>();
    l1.add(1); l1.add(2); l1.add(3); l1.add(4);




    new Test().fun(l1);
  }
}
