import java.util.*;

class Test{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1); list.add(2); list.add(3);
    list.forEach(System.out::println);
  }
}
