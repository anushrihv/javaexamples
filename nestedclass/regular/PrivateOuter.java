//package regular;

class Outer{
  public class Inner{

  }
}

public class PrivateOuter{
  public static void main(String[] args) {
    Outer.Inner i = new Outer().new Inner();
  }
}
