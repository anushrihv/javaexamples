interface Executable{
  void execute();
}

class Test{
  public static void main(String[] args){
    int a=10;
    Executable e = ()->{throw new RuntimeException();};
    e.execute();
  }
}
