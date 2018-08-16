//accessing inner class' private method from outside the outer class

class Test{
  private int a=20;

  class Inner{
    int a=10;

    private void show(){
      System.out.println("within private inner class method"+Test.this.a);   //accessing shadowed outer class variable
    }
  }

}

class MainClass{
  public static void main(String[] args) {
    Test t = new Test();
    Test.Inner i = t.new Inner();
    i.show();
  }
}
