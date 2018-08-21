//putting unreachable statements after throw in an if block


class MyException extends Exception{

}

class Test{
  public static void main(String[] args) {
    try{
      System.out.println("before throwing");
      if(true) throw new MyException();             //works fine
      System.out.println("after throwing");
    }
    catch(MyException e){
      e.printStackTrace();
    }

    catch(Exception e){
      System.out.println("generic catch");
    }

  }
}
