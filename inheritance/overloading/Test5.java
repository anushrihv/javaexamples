//overloading with int,Integer and Integer,int
// ambiguity.. compiler error

class Test5{
  int add(int a,Integer b){
    return a+b;
  }

  int add(Integer a, int b){
    return a+b;
  }

  public static void main(String[] args) {
    Test5 t = new Test5();
    t.add(5,5);
  }
}
