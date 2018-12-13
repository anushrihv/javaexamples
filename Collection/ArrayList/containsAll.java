import java.util.*;

class Test{
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(1); l.add(2); l.add(3);

    List<String> l2 = new ArrayList<>();
    l2.add("1");

    System.out.println(l.containsAll(l2));
  }
}
