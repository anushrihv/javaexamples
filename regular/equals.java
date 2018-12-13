class Test{
  int var;
  String str;

  Test(int var,String str){
    this.var=var;
    this.str=str;
  }

  public boolean equals(Object o){
    Test t = (Test)o;

    if(this.var==t.var && this.str.equals(t.str)){
      return true;
    }
    else return false;
  }

  public int hashCode(){
    return (str+String.valueOf(this.var)).hashCode();
  }
}

class Main{
  public static void main(String[] args) {
    Test t1 = new Test(10,"10");
    Test t2 = new Test(10,"10");
    System.out.println(t1.hashCode()==t2.hashCode());

  }
}
