class Test{
  static int var=10;

  static{
    //var=10;
    System.out.println("within static block "+ var);
}

  public static void main(String args[]){
    //System.out.println(var);
  }
}
