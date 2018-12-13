import java.util.*;

class Main{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1); list.add(2); list.add(3); list.add(4);

    Iterator<Integer> i1 = list.iterator();
    Iterator<Integer> i2 = list.iterator();
    while(i1.hasNext()){
      i1.next();
      i1.remove();
    }

    while(i2.hasNext()){
      i2.next();
    }
    System.out.println(list);
  }
}
