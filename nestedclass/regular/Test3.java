
class Outer{

  class Inner{
    public static final int var=10;
  }

  void createInner(){
    Inner i = new Inner();
    System.out.println(Inner.var);
  }

  public static void main(String[] args) {
    Outer o = new Outer();

    o.createInner();
  }
}
