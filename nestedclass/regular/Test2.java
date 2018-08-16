//creating inner class object within static and non static methods and as a global variable

class MyOuter{
  private int i=10;
//  MyInner in = new MyInner();

  void makeInner(){
    MyInner in = new MyInner();    //cant be placed in a static method
    in.show();
  }

  class MyInner{
    void show(){
      System.out.println("i= "+i);
    }
  }

  public static void main(String args[]){
    //MyOuter.makeInner();
  //  MyInner in;
  }

}
