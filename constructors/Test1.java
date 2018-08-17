//accessing private constructor outside the class

class A{
  private A(){
    System.out.println("within constructor");
  }


}

class B{
  public static void main(String[] args) {
    A a = new A();           //cannot access
  }
}
