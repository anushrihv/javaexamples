class FinalInner{

 final class Inner{
   void show(){
     System.out.println("within inner");
   }
  }

  class SubInner extends Inner{    // cannot inherit from a final class
    void show(){
      System.out.println("within subinner");
    }
  }

  public static void main(String[] args){
    FinalInner out = new FinalInner();
    FinalInner.SubInner sub = out.new SubInner();
    sub.show();
  }

}
