//overriding equals 

class Employee{
  String name;
  int id;

Employee(String str,int id){
    this.name=str;
    this.id=id;
  }

  public boolean equals(Object o){

    if(o==null) return false;
    if(o==this) return true;

    if(!(o instanceof Employee) ) return false;
    Employee e = (Employee) o;



    return(this.name==e.name && this.id==e.id);
  }

  public static void main(String[] args) {
    Employee e1 = new Employee("e1",10);
    Employee e2 = new Employee("e2",20);
    System.out.println(e1.equals(e2));
  }
}
