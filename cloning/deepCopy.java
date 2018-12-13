//deep copying

class Test{
  int a,b;
  Test(int x,int y){
    a=x;b=y;
  }
}

class Student implements Cloneable{
  String name;
  int id;
  Test t = new Test(10,20);

  Student(String str,int id){
    name=str;
    this.id=id;
  }

  public Object clone() throws CloneNotSupportedException{
    Student s = (Student) super.clone();
    s.t = new Test(100,200);
    return s;
  }

  public static void main(String[] args) throws CloneNotSupportedException{
    Student s1= new Student("s1",1);
    Student s2 = (Student) s1.clone();
    System.out.println(s1==s2);        //returns false

  }
}
