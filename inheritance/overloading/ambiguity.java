class Test{
  void add(double a){
      System.out.println("double char");
  }

  void add(char a){
      System.out.println("float double");
  }

  public static void main(String[] args) {

    new Test().add(5);
  }
}
