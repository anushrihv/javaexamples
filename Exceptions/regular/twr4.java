class Res implements AutoCloseable{
  public void close(){
    System.out.println("closed");
  }
}

class Test{
  public static void main(String[] args) {
    Res r = new Res();
    r.close();
  }
}
