class Outer{
  class Inner{
    void show(){
      System.out.println("super class");
    }
  }
}

class Another extends Outer.Inner{
    Another(){
      new Outer().super();
    }
  

  public static void main(String[] args) {
    Another a = new Another();
  }
}
