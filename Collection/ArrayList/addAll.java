import java.util.*;

class Test{
  public static void main(String[] args) {
    List<Number> l = new ArrayList<>();

    List<Integer> l2 = new ArrayList<>();
    l2.add(1); l2.add(2);

    List<Long> l3 = new ArrayList<>();
    l3.add(Long.valueOf(100));

    System.out.println(l.addAll(l2));
    System.out.println(l.addAll(l3));
  }
}
