//within an abstract class 'this' refers to the concrete class' object . but using 'this' you can access the current class' variables only.
//if you override a method of abstract class within the concrete class , calling the method using 'this'  will call the overridden method.

abstract class Test{
  int a,b,c;
  Test(int a,int b){
    this.a = a;
    this.b = b;
    System.out.println(this.call());
    System.out.println(this.c);
  }

  int call(){
    return 10;
  }


}

class Concrete extends Test{
  int c=100;
  Concrete(int a,int b){
    super(a,b);
  }

  public static void main(String[] args) {
    Concrete c = new Concrete(10,20);
  }

  int call(){
    return 100;
  }
}
