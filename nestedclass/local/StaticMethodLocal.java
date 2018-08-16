class MethodLocal{
  static int var=20;

  static void fun(){
    int var=20;
    class Inner{
      //static int var=30;              //not allowed
      void show(){
        System.out.println("within method local inner class"+var);  //var has to be static
      }
    }
    //var=30;

      Inner in = new Inner();
      in.show();
  }

  public static void main(String[] args) {
    MethodLocal.fun();
  }

}
