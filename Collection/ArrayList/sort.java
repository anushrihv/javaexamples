import java.util.*;

class Animal implements Comparable<Animal>{
  int id;
  String name;

  Animal(int id,String name){
    this.id = id;
    this.name = name;
  }

  public int compareTo(Animal a){
    if(a==null) throw new NullPointerException();
    if(this.id<a.id ) return -1;
    else if(this.id == a.id) return 0;
    else return 1;
  }

  public static void main(String[] args) {
    Animal a1 = new Animal(1,"1");
    Animal a2 = new Animal(5,"5");
    Animal a3 = new Animal(2,"2");
    Animal a4 = new Animal(8,"8");

    List<Animal> l = new ArrayList<>();
    l.add(a1); l.add(a2); l.add(a3); l.add(a4);

    Collections.sort(l);

    System.out.println(l);
  }
}
