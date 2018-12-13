import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("1"); al.add("2"); al.add("3");

    List<String> al2 = List.of();
    System.out.println(al2);        //unmodifiable

  }
}
