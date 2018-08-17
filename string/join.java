class Test{
  public static void main(String[] args) {
    String[] arr={"first","second","third"};

    String str=String.join("->",arr);

    //System.out.println(str);

    char[] ch=str.toCharArray();

    for(char c:ch){
      System.out.print(c+" ");
    }
  }
}
