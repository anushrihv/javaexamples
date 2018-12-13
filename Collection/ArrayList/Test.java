import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("1"); al.add("2"); al.add("3"); al.add("4");

    List l = al.subList(1,3);
    al.add(0,"200");
    l.add("100");
    System.out.println(l);
    System.out.println(al);
  }
}
