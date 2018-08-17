class Super{
  void show(){
    System.out.println("in super class");
  }
}

class Outer{
  Super s = new Super(){
    void show(){
      System.out.println("in anon class");
    }
  };

  void invokeAnon(){
    s.show();
  }

  public static void main(String[] args) {
    Outer o = new Outer();
    //o.invokeAnon();
    }
}
