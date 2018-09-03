class Super{
  void show(){
    System.out.println("in super class");
  }

  void display(){
    System.out.println("in display");
  }
}

class Outer{
  Super s = new Super(){
    void show(){
      System.out.println("in anon class");
    }

    void display(){
      System.out.println("in anon class display");
    }
  };

  void invokeAnon(){
    s.show();
    s.display();
  }

  public static void main(String[] args) {
    Outer o = new Outer();
    o.invokeAnon();
    }
}
