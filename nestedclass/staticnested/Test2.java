class Super{
  static int var=30;
}

class Outer{
  class Inner extends Super{
    int i=20;
    void show(){
      System.out.println("within static inner "+var);
    }
  }

  public static void main(String[] args){
    Sub s = new Sub();

  }
}

class Sub extends Outer.Inner{

  public Sub(){
    new Outer().super();
  }
  void show(){System.out.println(i);}
}
