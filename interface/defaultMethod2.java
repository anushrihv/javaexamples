interface I{

    static void show(){
      System.out.println("within I");
    }

  }

interface I2 extends I{

}


class A implements I2{
  public static void main(String[] args) {
    I2.show();
  }
}
