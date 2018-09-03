//trying to use static within inner class

class Super{
  void show(){
    System.out.println("within super");
  }
}

class Outer{

   Super show(){
    class Inner extends Super{
      int var=20;
      void show(){
        System.out.println("within inner ");
      }
    }

    Inner i = new Inner();
    return i;
  }


  public static void main(String args[]){
    Outer o = new Outer();
    Super s = o.show();
    s.show();

  }
}
