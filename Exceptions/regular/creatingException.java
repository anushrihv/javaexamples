class Main{

  void checkFood(String s) throws BadFoodException{
    if(s.equals("abc")){
      throw new BadFoodException();
    }else{
      System.out.println("no exception thrown");
    }

  }

  class BadFoodException extends Exception{

  }

  public static void main(String[] args) {
    String s = args[0];
    Main m = new Main();
    try{
      m.checkFood(s);
    }catch(BadFoodException b){
      System.out.println("exception caught");
    }
  }

}
