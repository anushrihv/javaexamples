class Test{
  static int var=10;
  static class Inner{


     void show(){

      System.out.println("in static inner class"+var);
    }
  }

  public static void main(String[] args) {
    // //Test t = new Test();
     Test.Inner i = new Test.Inner();
     i.show();
  }
}
