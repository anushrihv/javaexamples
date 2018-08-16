class MethodLocal{
  //private int var=20;

  void fun(){
    int var=20;
    class Inner{
      //var=30;              //not allowed
      void show(){
        System.out.println("within method local inner class"+var);
      }
    }
    //var=30;

      Inner in = new Inner();
      in.show();
  }

  public static void main(String[] args) {
    MethodLocal m = new MethodLocal();
    m.fun();
  }

}
