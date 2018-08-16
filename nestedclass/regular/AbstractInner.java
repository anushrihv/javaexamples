class AbstractInner{

 abstract class Inner{
   abstract void show();
  }

  class SubInner extends Inner{    // cannot inherit from a final class
    void show(){
      System.out.println("within subinner");
    }
  }

  public static void main(String[] args){
    FinalInner out = new FinalInner();
    FinalInner.Inner in = out.new SubInner();
    in.show();
  }

}
