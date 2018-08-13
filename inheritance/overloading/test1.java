class A{
  /*void fun(double a){
    System.out.println("int "+a);
  }*/

  void fun(Integer a){
    System.out.println("Integer"+a);
  }

  void fun(int... a){
    System.out.println("varargs"+a);
  }

//cant declare both int[] and int...
/*  void fun(int[] a){
    System.out.println("array "+a);
  }*/

void fun(int[] a , int... b){
  System.out.println("int[] and int varargs"+ a +" "+ b);

}
}

public class test1{
  public static void main(String args[]){
    A a = new A();
    a.fun(Integer.valueOf(5));
    a.fun('a');
    a.fun(Character.valueOf('a'));
    a.fun(new int[]{1,2,3,4});
    a.fun(2);
  }
}
