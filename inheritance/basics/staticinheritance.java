class A
{
    static int i = 10;

    static void method()
    {
        System.out.println("Static Method");
    }
}

class B extends A
{

}

public class staticinheritance
{
    public static void main(String[] args)
    {
        B.method();       //Calling inherited static method
        B.i=20;
        System.out.println(A.i);    //printing inherited static field.
    }
}
