class Test{

  void first(){
    second();
  }

  void second(){
    try{
      third();
    }
    catch(Exception e){
      System.out.println("caught in second");
      e.printStackTrace();
    }
  }

  void third(){
    String s = null;
    s.toUpperCase();
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.first();
  }
}
