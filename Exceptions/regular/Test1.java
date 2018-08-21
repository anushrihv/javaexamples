//regular try ctach finall program

class Test{

  static void show(){
    String s=null;
    s.toUpperCase();
  }

  public static void main(String[] args) {
    try{
      show();
    }
    catch(Exception e){
      System.out.println("Exception caught");
    }
    finally{
        System.out.println("within finally");
    }
    System.out.println("after catch");
  }
}
