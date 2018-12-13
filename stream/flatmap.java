import java.util.stream.*;
import java.util.*;

class Test{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a b c");
    list.add("d e f");

    long count = list.stream().flatMap(str->Stream.of(str.split(" "))).count();
    System.out.println(count);
  }
}
