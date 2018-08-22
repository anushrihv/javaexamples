//overriding equals and hashCode

class Employee{
  String name;
  int id;

Employee(String str,int identity){
    this.name=str;
    this.id=identity;
  }

  public boolean equals(Object o){

    if(o==null) return false;
    if(o==this) return true;

    if(!(o instanceof Employee) ) return false;
    Employee e = (Employee) o;

    return(this.name==e.name && this.id==e.id);
  }

  public int hashCode(){
    return (name+String.valueOf(this.id)).hashCode();

  }

  public static void main(String[] args) {
    Employee e1 = new Employee("e1",100);
    Employee e2 = new Employee("1e",100);
    System.out.println(e1.equals(e2));

    //e2=e1;

    System.out.println(e1.hashCode()==e2.hashCode());

    System.out.println("identity hashcode of e1 "+System.identityHashCode(e1));
    System.out.println("our hashcode value of e1 "+e1.hashCode());
    System.out.println("our hashcode value of e2 "+e2.hashCode());
  }
}
