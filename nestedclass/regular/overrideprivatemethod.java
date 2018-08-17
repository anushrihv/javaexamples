//overriding private method in inner class
/* private methods cannot be over ridden, not even in nested classes because private members are early binded during compile time */

class Outer{
  private void show(){
    System.out.println("within outer");
  }

  class Inner extends Outer{
    private void show(){
      System.out.println("within inner");
    }
  }

  public static void main(String[] args) {
    Outer o = new Outer();
    Outer o2 = o.new Inner();
    o2.show();
  }
}
