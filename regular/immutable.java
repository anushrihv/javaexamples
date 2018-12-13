class Person implements Cloneable{
  String name;
  int age;
}

final class Test{
  private int id;
  private Person p;
  private String testname;

  Test(int id,Person p,String testname){
    this.id = id;

    this.p = new Person();
    this.p.name = p.name;
    this.p.age = p.age;

    this.testname = testname;
  }

  public int getId(){
    return id;
  }

  public Person getPerson(){
    Person p2 = p.clone();
  }

  public String getTestname(){
    return testname;
  }
}
