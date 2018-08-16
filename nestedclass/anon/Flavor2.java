// implementing interface

interface Animal{
  void show();
}

class Outer{
  Animal a = new Animal(){
    { System.out.println("within init block"); }          //allowed
    public void show(){
      System.out.println("overriding successful");
    }
  };

  void callAnon(){
    a.show();
  }

  public static void main(String args[]){
    Outer o = new Outer();
    o.callAnon();
  }
}
