//number 5 is printed

class Main{
  void show(Number a){
    System.out.println("number"+a);
  }

  void show(Long a){
    System.out.println("long"+a);
  }

  void show(int a){
    System.out.println("int "+a);
  }

  public static void main(String[] args){
    Main m = new Main();
    m.show(Integer.valueOf(5));
  }
}
