import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(0); al.add(1); al.add(3);

    List<Integer> l = List.copyOf(al);
    al.set(0,100);
  }
}
