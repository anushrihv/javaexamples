class Test{
  public static void main(String[] args) {
    Test t = new Test();
    System.out.println(t.getClass());
    System.out.println(Test.class);
    System.out.println(t.getClass()==Test.class);
  }
}

class Another{

}
