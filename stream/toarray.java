import java.util.stream.*;
import java.util.*;

class Test{
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<10;i++){
      list.add(i);
    }

    Integer arr[] = list.stream().filter(i->i%2==0).toArray(Integer[]::new);
    for(int i : arr){
      System.out.print(i+" ");
    }
  }
}
