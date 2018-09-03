class Test{
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());    //16
    sb.append("qwertyuiopasdfghjkl");
    System.out.println(sb.capacity());    //34
    sb.delete(0,20);
    System.out.println(sb.capacity());     //34
  }
}
