import java.util.*;

class Test{
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("1");
    al.add("2");
    al.add("3");
    al.add("4");
    al.add("5");

    Iterator i = al.iterator();

    while(i.hasNext()){
      String s = (String) i.next();
      if(s.equals("3")){
        al.add("8");
        al.remove("1");
      }
    }
  }
}
