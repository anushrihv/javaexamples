//anon class within method arguement
interface Foo{
  int var=20;
  void display();
}


class Test{
  void show(Foo f){
    System.out.println("Foo var ="+f.var);
    f.display();
  }
}

class Outer{
  Test t = new Test();
  t.show(new Foo(){
    public void display(){
      System.out.println("class within arg to a method");
    }
  });
}
