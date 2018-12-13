import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("1"); al.add("1"); al.add("1a");

    ArrayList<Integer> al2 = new ArrayList(al);
    System.out.println(al2);
  }
}
