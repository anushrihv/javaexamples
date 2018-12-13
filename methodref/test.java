import java.util.*;
import java.util.stream.*;


class Test{
  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();
    lines.add("a a a");
    lines.add("b b b");
    lines.add("c c c");

    long count = lines.stream().flatMap(line->Stream.of(line.split(" "))).count();
    System.out.println(count);
  }
}
