//pointing to the same string


class Test{
  String str="Hello";
  String str2="Hello";
  static char ch[]= {'a','b','c'};
  static int codePoint[]={1,97,23};

  public static void main(String[] args) {
    Test t = new Test();
    if(t.str==t.str2){
      System.out.println("pointing to the same string ");
    }
    else{
      System.out.println("pointing to different strings ");
    }

    String x="abcd";
    System.out.println(x.toString());            //prints abcd

    String s = new String(ch,1,0);           //length=0
    System.out.println(s);                  //prints nothing

    System.out.println(new String(codePoint,0,3));
  }
}
