import java.util.*;
import java.util.stream.*;

class Test{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("1"); list.add("2"); list.add("3");
    list.add("4"); list.add("5");

    
    List<Integer> evenlist = list.stream().map(s->Integer.valueOf(s)).filter(i->i%2==0).collect(Collectors.toList());
    System.out.println(evenlist);
  }
}
