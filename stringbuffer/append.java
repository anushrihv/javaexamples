class Test{
  public static void main(String[] args) {
    boolean b = true;
    String str=" apostek";
    char[] ch={' ','b','n','g','l','r'};
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.append("");
    sb.append(str,0,4);        //Hello apo
    sb.append(ch);
    sb.append(b);
    sb.appendCodePoint(24);

    StringBuffer sb2 = new StringBuffer(new String("apostek"));

    sb2.delete(1,3);

    System.out.println(sb2);
  }
}
