import java.util.*;

class Test{
  public static void main(String[] args) {
    SortedSet<Integer> s = new TreeSet<>();
    s.add(1);
    s.add(3);
    s.add(5);
    s.add(7);
    s.add(11);

    Set<Integer> s2 = s.subSet(3,7);
    s2.add(6);
    System.out.println(s2);
    System.out.println(s);
  }
}
