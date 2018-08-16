//trying to use static within inner classes

class Outer{
  class Inner{
    /*public static void main(String args[]){
      System.out.println("Hello");
    }*/
    public static final int var;
  }

  public static void main(String args[]){
    //Outer.Inner i = new Outer.Inner();
  }
}
