class Fruit{

}

class Apple extends Fruit{

}
class RedApple extends Apple{

}

public class Test2{

  void show(Fruit f){
    System.out.println("within Fruit");
  }

  void show(RedApple a){
    System.out.println("within Apple");
  }

  public static void main(String[] args){
    Test2 t = new Test2();
    Fruit f = new Fruit();
    Apple a = new Apple();
    t.show(a);
  }
}
