import java.util.*;
import java.util.function.*;

class Person{
  String name;

  public Person(String name){
    this.name = name;
  }

}

class Test{
  public static void main(String[] args) {
    Map<String,Person> map = new HashMap<String,Person>();
    map.put("first",new Person("a"));
    map.put("second",new Person("b"));
    map.put("third",new Person("c"));

    // Consumer<Person> action = new Consumer<Person>(){
    //   @Override
    //   public void accept(Person p){
    //     System.out.println(p.name);
    //   }
    // };

    map.forEach((s,p)->{
      System.out.println(s + " " +p.name);});
  }
}
