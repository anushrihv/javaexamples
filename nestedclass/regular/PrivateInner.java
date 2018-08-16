class PrivateInner{

 private class Inner{
   private Inner(){}
   void show(){
     System.out.println("within inner");
   }
  }
}

class Test{

    public static void main(String[] args){
      PrivateInner out = new PrivateInner();
      PrivateInner.Inner in = out.new Inner();  //cant access
      in.show();
    }
}
