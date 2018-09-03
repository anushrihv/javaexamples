class Test{
  public static void main(String[] args) {
    try{
      if(true) throw new Exception();
      System.out.println("after throwing");
    }catch(Exception e){

    }
  }
}
