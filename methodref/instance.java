import java.util.*;

class Person{
  int age = 10;
  public void m1(){
    System.out.println("person age is " + age);
  }
}

class Main{
  public static void main(String[] args) {
    List<Person> list = new ArrayList();
    list.add(new Person());
    list.add(new Person());
    list.add(new Person());
    list.forEach(Person::m1);
  }
}
