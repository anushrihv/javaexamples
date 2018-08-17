class Test{
  public static void main(String[] args){
    String s1="Hello ";
		String s2="World";

		String s3=new String("Hello ");
		String s4=new String("World");

		String x1=s1.concat(s2);
		String x2=new String(s1.concat(s2));

		String y1=s3.concat(s4);
		String y2=new String(s3.concat(s4));

		String s5="Hello World";
		System.out.println(("World"==s2));
		System.out.println();

		System.out.println(("Hello World"==x1));
		System.out.println(("Hello World"==x2));
		System.out.println(("Hello World"==y1));
		System.out.println(("Hello World"==y2));
		System.out.println();

		System.out.println(("Hello World"==s5));
		System.out.println();

		System.out.println((x1==x2));
		System.out.println((x1==y1));
		System.out.println((x1==y2));
		System.out.println();

		System.out.println((x2==y1));
		System.out.println((x2==y2));
		System.out.println();

		System.out.println((y2==y1));
  }
}
