class Test{
  public static void main(String[] args) {
    String s ="abc,def,abcd,abc";
    //String[] arr = s.split(",,");
    String[] arr= s.split(",",2);
    for(String temp:arr){
      System.out.println(temp);
    }
  }
}
