import java.util.*;

class Test{
  public static void main(String[] args) {
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"one");
    map.put(2,"two");
    map.put(3,"three");
    map.put(4,"four");
    map.put(5,"five");

    System.out.println(map);

    Set<Integer> set = map.keySet();
    Iterator<Integer> i = set.iterator();
    while(i.hasNext()){
      int val = i.next();
      if(val==3){
        map.replace(3,"three","THREE");
      }
      else i.remove();
    }

    System.out.println(map);
  }
}
