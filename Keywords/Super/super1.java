//use of super keyword

class A
{
    int i;

    public A(int i)
    {
        this.i = i;
    }

    void methodA()
    {
        System.out.println(i);
    }
}

class B extends A
{
    public B()
    {
        super(10);    //Calling super class constructor
    }

    void methodB()
    {
        System.out.println(i);    //accessing super class field

        methodA();    //Calling super class method
    }

    public static void main(String args[]){
      B b = new B();
      b.methodB();
    }
}
