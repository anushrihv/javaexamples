//default methods in interfaces


interface Animal{
  void show();
  default void display(){
    System.out.println("within display");
  }
}

class Test implements Animal{
  public void show(){

    System.out.println("within animal show");
  }


  public static void main(String[] args) {
    display();
  }
}
