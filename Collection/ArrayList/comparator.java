import java.util.*;

class Sorter implements Comparator<A>{
  public int compare(A a,A b){

    return a.var-b.var;
  }
}

class A{
  int var;

  A(int var){
    this.var=var;
  }
  public static void main(String[] args) {
    A a1 = new A(20);
    A a2 = new A(10);
    List<A> l = new ArrayList<>();
    l.add(a1);
    l.add(a2);
    Sorter s = new Sorter();
    l.sort(s);
    for(A obj : l){
      System.out.println(obj.var);
    }
  }
}
