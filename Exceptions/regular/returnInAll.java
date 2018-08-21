//having return statements in try catch and throw

class Test{

  int fun(){
    int a=0;
    try{
      return a;           //returns 0

    }
    catch(Exception e){
      return 2;
    }
    finally{
      a=4;
    }
  }

  public static void main(String[] args) {
    Test t = new Test();
    System.out.println(t.fun());
  }
}
