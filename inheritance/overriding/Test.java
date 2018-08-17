
class Super{
  int add(Integer a,int b){
    System.out.println("Super class");
    return a+b;
  }
}

class Test extends Super{

  int add(int a, Integer b){
    System.out.println("Subclass");
    return a+b;
  }

  public static void main(String[] args) {
    Super t = new Test();
    System.out.println(t.add(5,5));
  }
}
