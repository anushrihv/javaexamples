class Main{
  int val=20;
  private Main(){
    System.out.println("within main constructor");
  }

  public static void main(String[] args) {
    Main m = new Main();
    Test t = new Test();
    t.showMain(m);
  }
}


class Test{
  void showMain(Main m){
    System.out.println("accessing main within test" + m.val);

  }
}
