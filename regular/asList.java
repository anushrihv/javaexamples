import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(0);
    al.add(1);
    al.add(2);
    Iterator<Integer> i = al.iterator();
    System.out.println(i.next());
    System.out.println(i.next());
    //System.out.println(i.previous());
  }
}
