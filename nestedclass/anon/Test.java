class Popcorn{
  void show(){
    System.out.println("inside popcorn");
  }
}

class Outer{
  Popcorn p = new Popcorn(){
    void show(){
      System.out.println("inside anony class");
    }
  };

  void invokeAnon(){
    p.show();
  }

  public static void main(String[] args) {
    Outer o = new Outer();
    o.invokeAnon();
  }
}
