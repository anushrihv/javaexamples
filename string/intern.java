class Test{
  public static void main(String[] args) {
    String s1="Test";
    String s2=new String("Anushri");
    String s3=s2.intern();
    System.out.println(s2==s3);
  }
}
